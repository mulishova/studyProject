package study.studyProject;

public class StringBuilderExample {

    public static void main(String[] args) {
        String s = "123";
        String s2 = s.concat("456");

        System.out.println(s);
        System.out.println(s2);

        StringBuffer stringBuffer; // для многопоточных
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.insert(0, "-");
        System.out.println(stringBuilder);

    }
}
