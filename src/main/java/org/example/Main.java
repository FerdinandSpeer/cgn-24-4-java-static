package org.example;

import org.example.Challenge2.Count;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Person person1 =new Person(25, "Max");
        Person person2 =new Person(26, "Maxi");
        Person person3 =new Person(28, "Maxim");

        System.out.println(person1);
        System.out.println(person1.isAlive());
        System.out.println(person2);
        System.out.println(person2.isAlive());
        System.out.println(person3);
        System.out.println(person3.isAlive());

        System.out.println("______________________");

        person3.setAlive(false);

        System.out.println(person1);
        System.out.println(person1.isAlive());
        System.out.println(person2);
        System.out.println(person2.isAlive());
        System.out.println(person3);
        System.out.println(person3.isAlive());

        Person.setAlive(true);

        //static Klassen sind sehr gut geeignet für Zählervariablen (Besuchzahl in allen Kaufhäusern einer Kaufhauskette)
        System.out.println("______________________");

        //Challenge2:
        //Step4: create multiple objects for the class "Count"
        Count count1 = new Count(1);
        Count count2 = new Count(2);
        Count count3 = new Count(3);
        Count count4 = new Count(4);
        Count count5 = new Count(5);

        //Step4: Call the .incrementInstanceCount - Methode for every created object
        count1.incrementInstanceCount();
        System.out.println(count1.getInstanceCount());
        count2.incrementInstanceCount();
        System.out.println(count2.getInstanceCount());
        count3.incrementInstanceCount();
        System.out.println(count3.getInstanceCount());
        count4.incrementInstanceCount();
        System.out.println(count4.getInstanceCount());
        count5.incrementInstanceCount();
        System.out.println(count5.getInstanceCount());

        //Step4: Call the .incrementalTotalCount for every object in the class "Count"
        Count.incrementTotalCount();
        System.out.println(Count.getTotalCount());

        //Step5: Override to-String method and print it out in the console
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);

    }
}