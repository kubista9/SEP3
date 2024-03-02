package com.example.slaughterhousepart3;

import com.example.slaughterhousepart3.entity.AnimalPart;
import com.example.slaughterhousepart3.generated.animal.AnimalObj;
import com.example.slaughterhousepart3.generated.product.ProductServiceGrpc;
import com.example.slaughterhousepart3.generated.animal.RequestText;
import com.example.slaughterhousepart3.generated.animal.ResponseText;
import com.example.slaughterhousepart3.repository.AnimalRepository;
import com.example.slaughterhousepart3.server.AnimalServiceImplementation;
import com.example.slaughterhousepart3.server.ProductPackageServiceImpl;
import com.example.slaughterhousepart3.service.AnimalService;
import com.sun.net.httpserver.HttpServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

import static com.example.slaughterhousepart3.service.AnimalService.animalRepository;


@SpringBootApplication
public class GrpcServer {
	public static void main(String[] args) throws IOException, InterruptedException {

		int port = 25565; // Choose a port for your gRPC server

		Server server = ServerBuilder.forPort(port)
				.addService(new ProductServiceGrpc.ProductServiceImplBase() {
					// Implement your gRPC service methods here
				})
				.addService(new AnimalServiceImplementation(new AnimalService(animalRepository))) // Add your actual service implementation
				.build();

		SpringApplication.run(GrpcServer.class,args);
		server.start();
		System.out.println("Server started on port: " + port);
		server.awaitTermination();
	}


	public Server grpcServer(AnimalServiceImplementation animalServiceImplementation) throws IOException {
		int port = 8080; // Choose a port for your gRPC server

		return ServerBuilder.forPort(port)
				.addService(animalServiceImplementation)
				.build();
	}
}

	/*
	public Server grpcServer(AnimalServiceImplementation animalServiceImplementation) throws IOException {
		return ServerBuilder.forPort(8080)
				.addService(animalServiceImplementation)
				.build();
	}
*/




/*

package com.example.slaughterhousepart3;

		import com.example.slaughterhousepart3.generated.animal.AnimalObj;
		import com.example.slaughterhousepart3.generated.product.ProductServiceGrpc;
		import com.example.slaughterhousepart3.generated.animal.RequestText;
		import com.example.slaughterhousepart3.generated.animal.ResponseText;
		import io.grpc.Server;
		import io.grpc.ServerBuilder;
		import io.grpc.stub.StreamObserver;

		import java.io.IOException;

public class GrpcServer {
	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(8080)

				.addService(new ProductServiceGrpc.ProductServiceImplBase() {

					public void addAnimal(AnimalObj request, StreamObserver<AnimalObj> responseObserver) {
						super.addAnimal(request, responseObserver);
					}


					public void getAnimalById(RequestText request, StreamObserver<ResponseText> responseObserver) {
						super.getAnimalById(request, responseObserver);
					}
				}).build();

		server.start();
		System.out.println("Server started on port : " + server.getPort());
		server.awaitTermination();

	}
}*/

