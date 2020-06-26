package study.studyProject;

import jdk.jshell.EvalException;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Car extends Generics implements Comparable, Serializable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Generics <T extends Generics & Comparable & Serializable> {
    public static void main(String[] args) throws Exception {
        //Generics<String> obj = new Generics<>();
        //Generics<Car> obj = new Generics<>();
        //obj.method(new Main());
        //obj.method("String");

        //obj.method2(new Main(), "String", 123);

        //obj.value = "value";
        //System.out.println(obj.value);
        /*obj.value = new Car();
        obj.method(new Car());
        System.out.println(obj.value);*/

        List<File> listFile = new ArrayList<>();
        
    }

    /*T value;

    T method (T type) {
        //type.compareTo(new Object());
        //System.out.println(type);
        type.someMethod();
        return type;
    } */

    /* <T> T method (T type) {
        System.out.println(type);
        return type;
    } */

    /* <T, U, K> void method2 (T type, U u, K k) {
        System.out.println(type);
        System.out.println(u);
        System.out.println(k);
    } */

    /*void someMethod() {
        System.out.println("some method");
    }*/
}