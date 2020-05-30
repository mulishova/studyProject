package study.studyProject;

import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
        File dir = new File("temp");
        File file = new File("temp.txt");

        if (!dir.exists()) {
            dir.mkdir();

            if (dir.isDirectory()) {
                System.out.println("dir created");
            }
        }
        if(!file.exists()) {
            file.createNewFile();

            if (file.isFile()) {
                System.out.println("file created");
            }
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("String1\n");
        fileWriter.write("String2\n");
        fileWriter.flush();
        //fileWriter.close();

        //char[] chars = new char[50];
        FileReader fileReader = new FileReader(file);
        //fileReader.read(chars);
        //System.out.println(chars);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("String3");
        bufferedWriter.newLine();
        bufferedWriter.write("String4");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }

    }
}
