package via.sdj3.proofofconcept_v3.jwtUtil;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.entity.Patient;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;

@Service
public class JwtUtil {
    private final String SECRET_KEY; // Change this to a secure key
    private static final long EXPIRATION_TIME = 864_000_000; // 10 days


    public JwtUtil() {
        this.SECRET_KEY = generateSecretKey();
    }

    public String generateDoctorToken(Doctor doctor) {
        return Jwts.builder()
                .setSubject("doctor")
                .claim("username",doctor.getUserName())
                .claim("id",doctor.getId())
                .claim("fullName",doctor.getFullName())
                .claim("specelization",doctor.getSpecialization())
                .claim("validated",doctor.isValidated())
                .claim("role", "Doctor")
                .claim("http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name", doctor.getFullName())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    public String generatePatientToken(Patient patient) {
        return Jwts.builder()
                .setSubject("patient")
                .claim("id",patient.getPatientId())
                .claim("fullName",patient.getFullName())
                .claim("username",patient.getUsername())
                .claim("role", "Patient")
                .claim("http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name", patient.getFullName())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();


    }

    public  String extractUsername(String token) {
        return extractClaims(token).getSubject();
    }

    public  Claims extractClaims(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }


    public  String generateSecretKey() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] keyBytes = new byte[64]; // Adjust the size based on your security requirements
        secureRandom.nextBytes(keyBytes);
        return bytesToHex(keyBytes);
    }

    private  String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }

    public boolean validateKey(String token) {
        try {
            System.out.println("Token before validation: " + token);

            String[] parts = token.split("\\.");
            if (parts.length != 3) {
                // The token should have three parts: header, payload, and signature
                return false;
            }

            // Decode each part
            String header = new String(Base64.getUrlDecoder().decode(parts[0]));
            String payload = new String(Base64.getUrlDecoder().decode(parts[1]));
            String signature = parts[2]; // Signature remains unchanged

            // Reassemble the token
            String cleanedToken = Base64.getUrlEncoder().withoutPadding().encodeToString(header.getBytes())
                    + "." + Base64.getUrlEncoder().withoutPadding().encodeToString(payload.getBytes())
                    + "." + signature;

            // Validate the cleaned token
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(cleanedToken);

            return true;
        } catch (ExpiredJwtException e) {
            // Token has expired
            return false;
        } catch (JwtException e) {
            // Other JWT exception, token is invalid
            return false;
        }
    }
    public int extractId(String token) {
        Claims claims = extractClaims(token);
        return claims.get("id", Integer.class);
    }

    public String extractRole(String token) {
        Claims claims = extractClaims(token);
        return claims.get("role", String.class);
    }

}
