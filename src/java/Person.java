package java;

/**
 * Created by leo on 15/8/19.
 */
public class Person {
    int age;
    float weight;
    float height;

    public float getHealthIndex(int weight, int height) {
        return weight/(height * height);
    }
}
