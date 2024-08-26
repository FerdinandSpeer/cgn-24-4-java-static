package org.example;

public class Person {
    private int age;
    private String name;

    private static boolean alive = true;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean isAlive() {
        return alive;
    }

    public static void setAlive(boolean alive) {
        Person.alive = alive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
