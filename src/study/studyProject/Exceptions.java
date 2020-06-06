package study.studyProject;

import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println(new Exceptions().someMethod());
        new Exceptions().method();
    }

    String someMethod() {
        try {
            System.out.println("try");
            Object obj = null;
            //obj.hashCode();
            return "try2";
        } catch (NullPointerException e) {
            System.out.println("catch");
            return "catch2";
        } finally {
            System.out.println("finally");
            return "finally2";
        }
    }

    void method () {
        try {
            System.out.println("try");
            throw new IOException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
    }
}
