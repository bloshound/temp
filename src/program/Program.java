package program;
//Program.java
//22:40   11.10.2019

public class Program{

    public static void main(String[] args) {

        Employee sam = new Employee("Sam", "Leman Brothers");
        sam.display();
        Client bob = new Client("Bob", "Leman Brothers");
        bob.display();
    }
}