package via.sdj3.slaughterhousepart2.grpcClient.animal;

import org.springframework.stereotype.Service;
import via.sdj3.slaughterhousepart2.entity.Animal;

@Service
public interface AnimalClient {
    Animal addAnimal (Animal animal);
//    Animal getAnimalById (int id);
}
