package study.studyProject;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        ClassINFO classInfo = new ClassINFO();
        System.out.println(classInfo instanceof Object); // является ли объект наследником или экземпляром класса

        int i = 0;
        for (System.out.println("first step"); i < 5; System.out.println("end"), i++) {}

        int[] arr = {1, 2, 3};
        for (int j : arr) {
            System.out.println(j);
        }


    }
}
