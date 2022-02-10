package com.carolinasanchez;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("cat", false, 2);
        Animal dog = new Animal("dog", true, 5);
        Animal mouse = new Animal("mouse", false, 10);

        PetShop taesShop = new PetShop("Taehyung's PetShop!");

        taesShop.getPetInventory().add(cat);
        taesShop.getPetInventory().add(dog);
        taesShop.getPetInventory().add(mouse);

        System.out.println("Welcome to " + taesShop.getPetShopName());
        System.out.println("");

        System.out.println("Pet Inventory: " + taesShop.getPetInventory().toString());
        System.out.println("");

        taesShop.animalSold("cat");
        System.out.println("");

        System.out.println("Pet Inventory: " + taesShop.getPetInventory().toString());
        System.out.println("Pets Sold: " + taesShop.getPetsSold().toString());
        System.out.println("");

        //System.out.println(cat.makesSound());
        System.out.println(taesShop.getPetsSold().get(taesShop.getPetsSold().size()-1).makesSound()); // gets the last index, so the last animal that was sold.

    }
}
