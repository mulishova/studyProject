package study.studyProject;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Collection collection = new ArrayList<>();

        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");

        Iterator iterator = collection.iterator();

        /*while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        for (Object o: collection) {
            System.out.println(o);
        }

        System.out.println("List");
        List collectionList = new ArrayList(); // на основе индексов
        collectionList.add("1");
        collectionList.add("2");
        collectionList.add("3");
        collectionList.set(1, "0");
        collectionList.add(1, "8");
        for (int i = 0; i < collectionList.size(); i++) {
            System.out.println(collectionList.get(i));
        }

        System.out.println("Queue");
        Queue collectionQueue = new PriorityQueue();
        collectionQueue.add("1");
        collectionQueue.offer("2");
        collectionQueue.offer("3");
        Iterator iteratorQueue = collectionQueue.iterator();
        while (iteratorQueue.hasNext()) {
            System.out.println(collectionQueue.poll());
        }
        System.out.println("N = " + collectionQueue.size());

        System.out.println("Set");
        Set collectionSet = new HashSet(); // только уникальные объекты
        collectionSet.add("1");
        collectionSet.add("2");
        collectionSet.add("3");
        collectionSet.add("3");
        collectionSet.add("3");
        for (Object o : collectionSet) {
            System.out.println(o);
        }

        //Set sortSet = new TreeSet(); // отсортированный
        Set sortSet = new TreeSet(new ComparePerson());
        sortSet.add(new Person(8));
        sortSet.add(new Person(1));
        sortSet.add(new Person(5));
        for (Object o : sortSet) {
            System.out.println(o);
        }

        Set<Person> set2 = new TreeSet<>(Comparator.comparingInt(Person::getAge));
        set2.add(new Person(100));
        set2.add(new Person(101));
        set2.add(new Person(99));
        set2.forEach(System.out::println);

        System.out.println("Map");
        Map map = new HashMap();
        map.put("1", new Books("The adventures of Sherlock Holmes"));
        map.put("2", new Books("A Game of Thrones"));
        map.put("3", new Books("The Thorn Birds"));
        //System.out.println(map.get("2"));
        Set set = map.entrySet(); // по ключам keySet()
        for (Object o : set) {
            System.out.println(o);
        }
    }
}

class Books { // map
    String name;

    public Books(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Person /*implements Comparable<Person>*/ { // treeSet
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    /*@Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

class ComparePerson implements Comparator<Person> { // если нет доступа к Person
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}