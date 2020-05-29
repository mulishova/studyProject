package study.studyProject;

import java.util.List;

public class ClassINFO {
    byte b1_$; // 1b, -128..128
    short s; // 2b, -32 768..32 767
    int i; // 4b, -2 147 483 648..2 147 483 647
    float f; // 4b

    int[] arr = {1, 2, 3};
    // int arr1[] = new int[] {1, 2, 3};
    int[][] arr2 = new int[][] {{1, 2}, {1, 2}};
    // int[] arr3[][];

    int a = (2 > 1) ? 2 : 1;

    Object[] masObject = new Object[10]; // null
    int[] mas = new int[10]; // 0
    int[][] masTD = new int[10][];

    enum size {SMALL(1), MEDIUM(2) { String getType () { return "B";} }, BIG(3);
        int i;
        String type = "A";

        size (int i) {
            this.i = i;
        }

        int getSize () {
            return this.i;
        }

        String getType () {
            return type;
        }
    }

    /* Обертки над примитивными типами ..............................................................................*/
    Character ch;
    Integer integer;
    Byte bt;
    Short sh;
    Double db;
    Float ft;
    Long lg;
    Boolean bool;

    Integer str = Integer.valueOf("8");
    int str1 = Integer.parseInt("9");
    short str2 = str.shortValue();

    List<Integer> list;

    Object method () {
        return 1;
    }
    /*...............................................................................................................*/

    public static void main(String[] args) {
        System.out.println(new ClassINFO().str1);
    }
}
