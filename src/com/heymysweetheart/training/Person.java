package com.heymysweetheart.training;

/**
 * Created by leo on 15/8/26.
 */
public class Person {
    String name = "Tom";
    double height;
    double weight;
    int age;
    String gender;
    boolean isMarried;
    String hobby;

    public Person(String namevalue) {
        this.name = namevalue;
    }

    public Person(String namevalue, String hobby) {
        this.name = namevalue;
        this.hobby = hobby;
    }

    public Person(String name, double height, double weight, int age, String gender,
                    boolean isMarried, String hobby) {
        this.name = name;
        this.hobby = hobby;
        this.height = height;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    public double[] getHealthIndex(double weight, double height) {
        double healthIndex = weight / (height * height);
        double[] doubles = new double[3];
        doubles[0] = weight;
        doubles[1] = height;
        doubles[2] = healthIndex;
        return doubles;
    }

    public boolean getMarritalStatus(Person person) {
        return person.isMarried;
    }

    public static void main(String[] args) {
        Person tom = new Person("cruise");  //
        Person lily = new Person("lily", "dancing");
        Person me = new Person("yuliang", 1.65, 60.0, 30, "male", false, "running");
        System.out.println(me.isMarried);
        System.out.println(me.hobby);


//        System.out.println(tom.name);
//        System.out.println(tom.age);
//        System.out.println(tom.height);
//        System.out.println(tom.gender + tom.height);
//        System.out.println(tom.isMarried);
//        System.out.println(tom.hobby);

        System.out.println(me.getHealthIndex(me.weight, me.height)[0] + " " + me.getHealthIndex(me.weight, me.height)[1] + " " + me.getHealthIndex(me.weight, me.height)[2]);
        System.out.println(lily.name);
        System.out.println(lily.age);
        System.out.println(lily.height);
        System.out.println(lily.hobby);
    }
}

