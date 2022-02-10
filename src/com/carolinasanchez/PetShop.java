package com.carolinasanchez;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private String petShopName;
    private List<Animal> petInventory;
    private List<Animal> petsSold;

    public PetShop(String petShopName) {
        this.petShopName = petShopName;
        this.petInventory = new ArrayList<>();
        this.petsSold = new ArrayList<>();
    }

    public String getPetShopName() {
        return petShopName;
    }

    public void setPetShopName(String petShopName) {
        this.petShopName = petShopName;
    }

    public List<Animal> getPetInventory() {
        return petInventory;
    }

    public void setPetInventory(List<Animal> petInventory) {
        this.petInventory = petInventory;
    }

    public List<Animal> getPetsSold() {
        return petsSold;
    }

    public void setPetsSold(List<Animal> petsSold) {
        this.petsSold = petsSold;
    }

    public void animalSold(String name) {
        for (int i = 0; i < petInventory.size(); i++) {
            if (petInventory.get(i).getName().equals(name)) {
                petsSold.add(petInventory.get(i));
                petInventory.remove(i);
                System.out.println("You've sold a " + petsSold.get(petsSold.size()-1).getName() + "!");
            }
        }
    }

    public void animalReturned(String name) { // do not add static here or this method will apply to the class itself instead of the instances of the class we create.
        for (int i = 0; i < petsSold.size(); i++) {
            if (petsSold.get(i).getName().equals(name)) {
                petInventory.add(petsSold.get(i));
                petsSold.remove(i);
                System.out.println("A " + petInventory.get(petInventory.size()-1).getName() + " has been returned.");
            }
        }
    }
}
