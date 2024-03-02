package via.sdj3.slaughterhousepart2.grpcClient.animal;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.checkerframework.checker.units.qual.A;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhousepart2.entity.Animal;
import via.sdj3.slaughterhousepart2.generated.animal.AnimalObj;
import via.sdj3.slaughterhousepart2.generated.animal.AnimalServiceGrpc;
import via.sdj3.slaughterhousepart2.generated.animal.RequestText;

@Service
public class GRPCAnimalClientImpl implements AnimalClient
{
    private AnimalServiceGrpc.AnimalServiceBlockingStub animalBlockingStub;

    public AnimalServiceGrpc.AnimalServiceBlockingStub getAnimalBlockingStub()
    {
        if (animalBlockingStub == null)
        {
            ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 25565).usePlaintext().build();
            animalBlockingStub = AnimalServiceGrpc.newBlockingStub(managedChannel);
        }
        return animalBlockingStub;
    }

    @Override
    public Animal addAnimal(Animal animal) {
        AnimalObj animalObj = AnimalObj.newBuilder().setId(animal.getAnimalId()).setName(animal.getName()).setDate(animal.getDateOfArrival()).setOrigin(animal.getPlaceOfOrigin()).setWeight(animal.getWeight()).build();
        AnimalObj animalObjFromServer;

        try
        {
            animalObjFromServer = getAnimalBlockingStub().addAnimal(animalObj);
        }
        catch (StatusRuntimeException sre)
        {
            System.out.println(sre.getStatus().getDescription());
            throw new RuntimeException(sre.getStatus().getDescription());
        }
        finally
        {
            animalBlockingStub = null;
        }

        System.out.println(animalObjFromServer.getName());
        Animal realObj = getAnimal(animalObjFromServer);
        System.out.println(realObj.getName());
        return realObj;
    }

    private Animal getAnimal(AnimalObj animalObjFromServer) {
        Animal returnedAnimal = new Animal();
        returnedAnimal.setAnimalId(animalObjFromServer.getId());
        returnedAnimal.setDateOfArrival(animalObjFromServer.getDate());
        returnedAnimal.setName(animalObjFromServer.getName());
        returnedAnimal.setPlaceOfOrigin(animalObjFromServer.getOrigin());
        returnedAnimal.setWeight(animalObjFromServer.getWeight());
        return returnedAnimal;
    }

//    @Override
//    public Animal getAnimalById(int id) {
//        AnimalObj animalObjFromServer;
//        RequestText idReqText = RequestText.newBuilder().setInputText(id).build();
//        try
//        {
//            animalObjFromServer = getAnimalBlockingStub().getAnimalById(idReqText);
//        }
//        catch (StatusRuntimeException sre)
//        {
//            System.out.println(sre.getStatus().getDescription());
//            throw new RuntimeException(sre.getStatus().getDescription());
//        }
//        finally
//        {
//            animalBlockingStub = null;
//        }
//        Animal realObj = new Animal(animalObjFromServer.getId(), animalObjFromServer.getDate(), animalObjFromServer.getName(), animalObjFromServer.getOrigin(), animalObjFromServer.getWeight());
//        return realObj;
//    }
}
