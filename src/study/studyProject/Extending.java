package study.studyProject;

class Extending1 {
    int a = 10;
    int b = 10;
    int c = 10;

    static void methodStatic(){
        System.out.println("A static");
    }

    void method() {
        System.out.println("A common");
    }

    void methodFieldA(){
        System.out.println("A fieldA = " + a);
    }

    void methodFieldB(){
        System.out.println("A fieldB = " + b);
    }

    void methodFieldC(){
        System.out.println("A fieldC = " + c);
    }
}

public class Extending extends Extending1 {
    int a = 20;
    int c = 20;

    static void methodStatic(){
        System.out.println("B static");
    }

    void method() {
        System.out.println("B common");
    }

    void methodFieldA(){
        System.out.println("B fieldA = " + a);
    }

    void methodFieldB(){
        System.out.println("B fieldB = " + b);
    }

    public static void main(String[] args) {
        Extending1 e = new Extending();
        e.method();
        e.methodFieldA();
        e.methodFieldB();
        e.methodFieldC();
    }
}