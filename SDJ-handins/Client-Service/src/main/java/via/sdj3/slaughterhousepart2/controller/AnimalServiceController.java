package via.sdj3.slaughterhousepart2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhousepart2.entity.Animal;
import via.sdj3.slaughterhousepart2.service.AnimalService;
import via.sdj3.slaughterhousepart2.service.AnimalServiceInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AnimalServiceController{
  private AnimalServiceInterface animalService;
  public AnimalServiceController(AnimalService animalService) {
    this.animalService = animalService;
  }

//  @GetMapping("/animals/{registrationNo}")
//  public ResponseEntity<Object> getAnimalById(@PathVariable("registrationNo") int registrationNo){
//    Optional<Animal> animal = animalService.getAnimalByRegistrationNo(registrationNo);
//    if (!animal.isPresent()){
//      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//    return new ResponseEntity<>(animal.get(), HttpStatus.OK);
//  }
//
//  @GetMapping("/animals")
//  public ResponseEntity<List<Animal>> getAnimals(
//      @RequestParam(required = false) String placeOfOrigin,
//      @RequestParam(required = false) String dateOfArrival
//  ) {
//    List<Animal> animals;
//    if (placeOfOrigin != null) {
//      animals = animalService.getAllAnimalsByOrigin(placeOfOrigin);
//    } else if (dateOfArrival != null) {
//      animals =  animalService.getAllAnimalsByDate(dateOfArrival);
//    } else {
//      animals =  animalService.getAllAnimals();
//    }
//    return new ResponseEntity<>(animals, HttpStatus.OK);
//  }

  @PostMapping(value="/animals/test")
  public ResponseEntity<Object> addAnimal(@RequestBody Animal animal){
    try {
      animalService.addAnimal(animal);
      System.out.println("Returning entity...");
      return ResponseEntity.ok().body(animal);
    }
    catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

  }
}
