package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;




import java.util.List;


/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override

    public void run(String... args) throws Exception {

        if (productRepository.count() == 0) {
            Product mini= new Product("Mini",100.0,15);
            Product doubleKick= new Product("Double-kick",100.0,15);
            Product carving= new Product("Carving",100.0,15);
            Product classicLongboard= new Product("Classic Longboard",100.0,15);
            Product downhillLongboard= new Product("Downhill Longboard",100.0,15);

            productRepository.save(mini);
            productRepository.save(doubleKick);
            productRepository.save(carving);
            productRepository.save(classicLongboard);
            productRepository.save(downhillLongboard);


        }

        if (partRepository.count() == 0) {
            InhousePart Trucks= new InhousePart();
            Trucks.setName("Trucks");
            Trucks.setInv(6);
            Trucks.setPrice(20.0);
            Trucks.setId(101);
            Trucks.setMin(0);
            Trucks.setMax(100);

            InhousePart Wheels= new InhousePart();
            Wheels.setName("Wheels");
            Wheels.setInv(7);
            Wheels.setPrice(30.0);
            Wheels.setId(102);
            Wheels.setMin(0);
            Wheels.setMax(100);

            InhousePart Bearings= new InhousePart();
            Bearings.setName("Bearings");
            Bearings.setInv(7);
            Bearings.setPrice(15.0);
            Bearings.setId(103);
            Bearings.setMin(0);
            Bearings.setMax(100);


            InhousePart GripTape= new InhousePart();
            GripTape.setName("Grip Tape");
            GripTape.setInv(7);
            GripTape.setPrice(15.0);
            GripTape.setId(104);
            GripTape.setMin(0);
            GripTape.setMax(100);


            InhousePart Deck= new InhousePart();
            Deck.setName("Deck");
            Deck.setInv(10);
            Deck.setPrice(40.0);
            Deck.setId(105);
            Deck.setMin(0);
            Deck.setMax(100);

            partRepository.save(Trucks);
            partRepository.save(Bearings);
            partRepository.save(GripTape);
            partRepository.save(Wheels);
            partRepository  .save(Deck);


        }

        if (outsourcedPartRepository .count() == 0) {
            OutsourcedPart goldTrucks= new OutsourcedPart();
            goldTrucks.setCompanyName("Golden Skateboards");
            goldTrucks.setName("Gold Trucks");
            goldTrucks.setInv(6);
            goldTrucks.setPrice(20.0);
            goldTrucks.setId(201);
            goldTrucks.setMin(0);
            goldTrucks.setMax(100);

            OutsourcedPart goldWheels= new OutsourcedPart();
            goldWheels.setCompanyName("Golden Skateboards");
            goldWheels.setName("Gold Wheels");
            goldWheels.setInv(7);
            goldWheels.setPrice(30.0);
            goldWheels.setId(202);
            goldWheels.setMin(0);
            goldWheels.setMax(100);

            OutsourcedPart goldBearings= new OutsourcedPart();
            goldBearings.setCompanyName("Golden Skateboards");
            goldBearings.setName("Gold Bearings");
            goldBearings.setInv(7);
            goldBearings.setPrice(15.0);
            goldBearings.setId(203);
            goldBearings.setMin(0);
            goldBearings.setMax(100);

            OutsourcedPart goldGripTape= new OutsourcedPart();
            goldGripTape.setCompanyName("Golden Skateboards");
            goldGripTape.setName("Gold Grip Tape");
            goldGripTape.setInv(7);
            goldGripTape.setPrice(15.0);
            goldGripTape.setId(204);
            goldGripTape.setMin(0);
            goldGripTape.setMax(100);

            OutsourcedPart goldDeck= new OutsourcedPart();
            goldDeck.setCompanyName("Golden Skateboards");
            goldDeck.setName("Gold Deck");
            goldDeck.setInv(10);
            goldDeck.setPrice(40.0);
            goldDeck.setId(205);
            goldDeck.setMin(0);
            goldDeck.setMax(100);

            outsourcedPartRepository.save(goldTrucks);
            outsourcedPartRepository.save(goldWheels);
            outsourcedPartRepository.save(goldBearings);
            outsourcedPartRepository.save(goldGripTape);
            outsourcedPartRepository.save(goldDeck);
        }
       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
