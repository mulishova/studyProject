package study.studyProject;

public class Overloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        short b = 5;
        obj.method(b); // ищет ближайшие примитивы целочисленные, потом с плавающей точкой, autoboxing к Short, Object, массив short
    }

    void method(int i) {
        System.out.println("int");
    }

    void method(long i) {
        System.out.println("long");
    }

    void method(Integer i) {
        System.out.println("Integer");
    }

    void method(double i) {
        System.out.println("double");
    }

    void method(short... i) {
        System.out.println("short...");
    }

    void method(Short i) {
        System.out.println("Short");
    }

    void method(Object i) {
        System.out.println("Object");
    }

    void method(Object... i) {
        System.out.println("Object...");
    }

    void method(byte i) {
        System.out.println("byte");
    }
}
