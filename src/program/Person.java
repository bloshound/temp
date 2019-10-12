package program;
//Person.java
//22:41   11.10.2019

abstract class Person {

    private String name;

    public String getName() { return name; }

    public Person(String name){

        this.name = name;
    }

    public abstract void display();
}