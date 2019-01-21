package lesson14;

import lesson13.auth.User;
import oop.Animal;
import oop.Dog;

import java.io.Serializable;


public class TriGen<T extends Comparable,V extends Animal & Serializable,K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public TriGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }
    T getOb1(){return ob1;}
    V getOb2(){return ob2;}
    K getOb3(){return ob3;}

    void showTypes(){
        System.out.println("Type of T is:"+ ob1.getClass().getName());
        System.out.println("Type of V is:"+ob2.getClass().getName());
        System.out.println("Type of K is:"+ob3.getClass().getName());
    }

    public static void main(String[] args) {
        TriGen<String, Dog,Integer> triGen1 = new TriGen<> ("str",new Dog(),25);
        //TriGen<Double, StringBuilder, User> triGen2 = new TriGen<>(2.56,(new StringBuilder()),(new User("log123","pas12")));

        triGen1.showTypes();
       // triGen2.showTypes();



    }

}

