import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("Scooby", 3));
        list.add(new Dog("Bruno", 2));
        list.add(new Dog("Oreo", 10));
        list.add(new Dog("Darcy", 4));
        list.add(new Dog("Tommy", 1));
        Collections.sort(list);
        for(Dog a: list)
            System.out.print(a.getName() + ", ");
        Collections.sort(list, new Dog());
        System.out.println(" ");
        for(Dog a: list)
            System.out.print(a.getName() +"  : "+ a.getAge() + ", ");
    }
}


class Dog implements Comparator<Dog>, Comparable<Dog>
{
    private String name;
    private int age;
    Dog() {
    }
    Dog(String n, int a) {
        name = n;
        age = a;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }
    public int compare(Dog d, Dog d1) {
        return d.age - d1.age;
    }
}