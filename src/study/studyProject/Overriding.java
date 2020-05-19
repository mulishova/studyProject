package study.studyProject;

class Parent {
    Parent method() {
        return new Parent();
    }
}

class Child extends Parent{
    @Override
    public Child method() {
        return new Child();
    }
}


public class Overriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println(parent.method());
        System.out.println(child.method());
    }
}
