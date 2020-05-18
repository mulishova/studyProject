package study.studyProject;

public class ClassINFO {
    byte b1_$; // 1b, -128..128
    short s; // 2b, -32 768..32 767
    int i; // 4b, -2 147 483 648..2 147 483 647
    float f; // 4b

    int[] arr = {1, 2, 3};
    // int arr1[] = {1, 2, 3};
    int[][] arr2 = {{1, 2}, {1, 2}};
    // int[] arr3[][];

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


}
