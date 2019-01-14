package oop;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format( "Person{ fullName='%s' , age=%d }"
                ,fullName,age);
    }

    void move() {
        System.out.println();
    }

    void talk(String message) {
        System.out.print(fullName + " talk " + message);
    }
}
