package com.company.devices;

import com.company.Salleable;
import com.company.creatures.human;

public class phone extends device  {
    @Override
    public boolean turnOn() {
        System.out.println("ON");
        return true;
    }

    public Salleable salleable = new Salleable() {
        @Override
        public void sell(human seller, human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("nie ma zwierzaka");
                } else {
                    System.out.println("jest twoje wymarzone zwierze !!!!!");
                    buyer.setCash(-price);
                    buyer.setPet(seller.getPet());
                    seller.setCash(+price);
                }

                if (seller.getCar() == null) {
                    System.out.println("nie ma fury");
                } else {
                    System.out.println("mamy tą fure ziom !!!");
                }

                if (seller.getPhone() == null) {
                    System.out.println("nie ma komory");
                } else {
                    System.out.println("jest komora");
                }
            }else {
                System.out.println("chyba cie na to nie stać ziomeg");
            }


        }

    };
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}