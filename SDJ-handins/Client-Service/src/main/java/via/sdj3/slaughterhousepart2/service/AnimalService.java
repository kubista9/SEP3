package via.sdj3.slaughterhousepart2.service;

import org.springframework.stereotype.Service;
import via.sdj3.slaughterhousepart2.entity.Animal;
import via.sdj3.slaughterhousepart2.grpcClient.animal.AnimalClient;
import via.sdj3.slaughterhousepart2.repository.IAnimalRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimalService implements AnimalServiceInterface
{
  private final AnimalClient client;

  public AnimalService(AnimalClient animalClient){
    client = animalClient;
  }

//  public Optional<Animal> getAnimalByRegistrationNo(int registrationNo){
//    return animalRepository.findById(registrationNo);
//  }
//
//  public List<Animal> getAllAnimals(){
//    List<Animal> animals = new ArrayList<>();
//    animalRepository.findAll().forEach(animal -> animals.add(animal));
//    return animals;
//  }
//
//  public List<Animal> getAllAnimalsByOrigin(String placeOfOrigin){
//    return animalRepository.findAll()
//        .stream()
//        .filter(animal -> animal.getPlaceOfOrigin().equals(placeOfOrigin))
//        .collect(Collectors.toList());
//  }
//
//  public List<Animal> getAllAnimalsByDate(String dateOfArrival){
//    return animalRepository.findAll()
//        .stream()
//        .filter(animal -> animal.getDateOfArrival().equals(dateOfArrival))
//        .collect(Collectors.toList());
//  }

  public Animal addAnimal(Animal animal){
      return client.addAnimal(animal);
  }
}
