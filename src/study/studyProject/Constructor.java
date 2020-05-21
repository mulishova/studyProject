package study.studyProject;

class ParentConstructor extends Object {

    {
        System.out.println("parent init");
    }

    ParentConstructor () {
        //super();
        System.out.println("Default Parent Constructor");
    }

    ParentConstructor (int i) {
        //super();
        System.out.println(i);
    }
}

public class Constructor extends ParentConstructor {

    {
        System.out.println("child init");
    }

    Constructor () {
        //super(5);
        System.out.println("Constructor");
    }

    public static void main (String[] args) {
        new Constructor();
    }
}

