package com.carolinasanchez;

public class Animal {
    // initialize the private variables (properties) of the animals within the class.
    private String name;
    private boolean isItBig;
    private int age;

    // generate a public constructor using the variables you've initialized. you can select all variables at once by using the shift key.
    public Animal(String name, boolean isItBig, int age) {
        this.name = name;
        this.isItBig = isItBig;
        this.age = age;
    }

    // generate the getters and setters for all the properties within your constructor. you can select all of them at once by using the shift key.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isItBig() {
        return isItBig;
    }

    public void setItBig(boolean itBig) {
        isItBig = itBig;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makesSound() {
        String soundMade = "";
        switch(this.name) {
            case "cat" -> soundMade = "meow!";
            case "dog" -> soundMade = "woof!";
            case "mouse" -> soundMade = "squeak!";
        } return "The " + this.name + " says " + soundMade;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
