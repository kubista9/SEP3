package com.example.slaughterhousepart3.server;

import com.example.slaughterhousepart3.entity.Animal;
import com.example.slaughterhousepart3.generated.animal.AnimalObj;
import com.example.slaughterhousepart3.generated.animal.AnimalServiceGrpc;
import com.example.slaughterhousepart3.service.AnimalService;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@GrpcService
public class AnimalServiceImplementation extends AnimalServiceGrpc.AnimalServiceImplBase {


    AnimalService animalService;
    private final static Logger log = LoggerFactory.getLogger(AnimalServiceImplementation.class);

    @Autowired
    public AnimalServiceImplementation(AnimalService animalService) {
        this.animalService = animalService;

    }

    @Override
    public void addAnimal(AnimalObj obj, StreamObserver<AnimalObj> streamObserver) throws HttpServerErrorException.NotImplemented
    {
        log.info("addAnimal called !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");

        System.out.println("I GOT HERE");

        int id = obj.getId();
        String date = obj.getDate();
        String name = obj.getName();
        String origin = obj.getOrigin();
        double weight = obj.getWeight();

        //AnimalObj.newBuilder()

        animalService.addAnimal(new Animal(id,date,name,origin,weight));



        streamObserver.onNext(obj);
        streamObserver.onCompleted();
        System.out.println("Great, success! ");
    }

}
