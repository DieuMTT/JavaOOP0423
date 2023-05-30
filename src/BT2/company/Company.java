package BT2.company;

import BT2.person.Person;

public class Company extends Person {
    public Company(String name, int age, String gender) {
        super(name, age, gender);
    }

    public static void main(String[] args) {
        Company Obj1 = new Company("Dieu", 30, "Females");
        System.out.println("Name:" + Obj1.getName());
        System.out.println("Age:" + Obj1.getAge());
        System.out.println("Gender:" + Obj1.getGender());
        System.out.println("--------------------------------------------------");
        System.out.println(Obj1.name);
        System.out.println(Obj1.age);
        System.out.println(Obj1.gender);
    }
}
