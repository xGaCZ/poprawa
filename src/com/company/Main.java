package com.company;

import com.company.devices.car;
import com.company.devices.phone;
import com.company.creatures.animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.creatures.Feedable;
import com.company.creatures.human;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

       public static void main(String[] args) {
              animal animal = new animal() {
                     @Override
                     public void feed(Double foodWeight) { }};
              animal.feed();
              animal.takeForAWalk();
          /**    animal.takeForAWalk();
              animal.takeForAWalk();
              animal.feed();
              animal.feed();
              animal.feed(); */
              human human = new human();
              //fura1\\
              car golfica  = new car();
              golfica.model = "mk3";
              golfica.producer = "golfica kurwica coropration";
              golfica.colour ="butelkowa zielen";
              golfica.price = 999.0;
              golfica.typee = "hedzbek";
              //fura2\\
              car pasat  = new car();
              pasat.model = "b5";
              pasat.producer = "Pasat starego SA.";
              pasat.colour ="rudy";
              pasat.price = 2745.0;
              pasat.typee = "sedan";
              //fura3\\
              car seat  = new car();
              seat.model = "ibiza ";
              seat.producer = "SEAT";
              seat.colour ="blue";
              seat.price = 555.5;
              seat.typee = "sportbek";
              //fura3\\
              human.addMyCar(pasat);
              human.setNewCar(pasat);

              phone phone = new phone();
              phone.setModel("hujawei");
              System.out.println(human.toString());
              System.out.println(pasat.toString());
              System.out.println(animal.toString());
              human buyer = new human();//inicjuje kupujacego \\
              buyer.setSalary(0.0);
              buyer.setCash(500);
              human seller = new human();//inicjuje sellera \\
              seller.setPhone(phone);
              seller.setPet(animal);
              seller.addMyCar(pasat);
              seller.setSalary(10000.0);
              animal.salleable.sell(seller, buyer, 3000.0);
              pasat.salleable.sell(seller, buyer, 2000.0);
              phone.salleable.sell(seller, buyer, 7000.0);
              System.out.println("siano sprzedawcy przed sprzedaza " + seller.getCash());
              System.out.println("siano nabywcy przed kupnem  " + buyer.getCash());
              System.out.println( " Data " + ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));//godzina \\

       }

}