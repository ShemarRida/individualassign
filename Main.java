package com.zipcodewilmington;


public class Main {
    public static void main(String[] args) {
        Person per1 = new Person("Shemar", "Rida");
        Person per2 = new Person("Pop", "Smoke");
        Person per3 = new Person("Bill", "Cosby");

        Person[] allPeople = {per1, per2, per3};

        PersonHandler perAll = new PersonHandler(allPeople);
        System.out.println(perAll.whileLoop());
        System.out.println("----------------------------");

        System.out.println(perAll.forLoop());
        System.out.println("----------------------------");

        System.out.println(perAll.forEachLoop());
        System.out.println("----------------------------");






    }

}
