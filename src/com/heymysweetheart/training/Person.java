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

    /**
     * 只有一个参数的构造函数
     * @param namevalue 所用实例化的对象的姓名参数
     */
    public Person(String namevalue) {
        this.name = namevalue;
    }

    /**
     * 包含部分类变量的构造函数
     * @param namevalue
     * @param hobby
     */
    public Person(String namevalue, String hobby) {
        this.name = namevalue;
        this.hobby = hobby;
    }

    /**
     * 有全部类变量的构造函数
     * @param name
     * @param height
     * @param weight
     * @param age
     * @param gender
     * @param isMarried
     * @param hobby
     */
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

    /**
     * 获得一个Pserson对象的健康指数的方法
     * @param weight
     * @param height
     * @return 返回类型为一个double数组类型,数组大小为3， 分别是体重、身高、健康指数
     */
    public double[] getHealthIndex(double weight, double height) {
        double healthIndex = weight / (height * height);
        double[] doubles = new double[3];
        doubles[0] = weight;
        doubles[1] = height;
        doubles[2] = healthIndex;
        return doubles;
    }

    /**
     * 获得一个Pserson对象的健康指数的方法
     * @param weight
     * @param height
     * @return 只返回Person对象的健康指数一个值。
     */
    public double getHealthIndexOnly(double weight, double height) {
        return weight / (height * height);
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

        //打印时分别获取数组的每一个值：体重，身高，健康指数，然后输出。
        System.out.println(me.getHealthIndex(me.weight, me.height)[0] + " " + me.getHealthIndex(me.weight, me.height)[1] + " " + me.getHealthIndex(me.weight, me.height)[2]);
        //调用方法getHealthIndexOnly， 只输出健康指数。
        System.out.println(me.getHealthIndexOnly(me.weight, me.height));
        System.out.println(lily.name);
        System.out.println(lily.age);
        System.out.println(lily.height);
        System.out.println(lily.hobby);
    }
}

