package com.company.devices;

import com.company.Salleable;
import com.company.creatures.human;
import java.net.URL;
import java.util.List;
public class phone extends device  {

    public String model;
    public static final String appName = "symulator";
    public static final String version = "beta";
    public static final String serverAddress = "997799";
    public List<String> appList;
    public URL url;

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
    public String installAnnApp(String appName) {

        return appName;
    }

    public String installAnnApp(String appName, String version) {

        return appName + version;
    }

    public String installAnnApp(String appName, String version, String serverAddress) {

        return appName + version + serverAddress;
    }

    public String installAnnApp(List<String> appList) {

        return appList.toString();
    }

    public String installAnnApp(URL url) {

        return url.toString();
    }

    public void setModel(String model) {
        this.model = model;
    }
}