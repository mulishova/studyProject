package study.studyProject;

import java.io.*;

public class Serialization implements Serializable {
    int level;
    transient int someValue; // не участвует в сериализации
    Equipment equipment;

    public static void main(String[] args) throws Exception {
        Serialization user = new Serialization();
        user.level = 18;

        SerializationChild child = new SerializationChild();
        child.childLevel = 50;

        Equipment equipment = new Equipment();
        equipment.equipmentLevel = 11;
        user.equipment = equipment;

        FileOutputStream fileOutputStream = new FileOutputStream("userFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //objectOutputStream.writeObject(user);
        objectOutputStream.writeObject(child);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("userFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Serialization newUser = (Serialization) objectInputStream.readObject();
        objectInputStream.close();

        //System.out.println(newUser.level);
        //System.out.println(newUser.equipment.equipmentLevel);

        System.out.println(child.childLevel);
    }
}

class SerializationChild extends Serialization{
    int childLevel;
}

class Equipment implements Serializable {
    int equipmentLevel;
}
