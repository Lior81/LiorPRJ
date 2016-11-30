package data;


/**
 * Created by student15 on 30/11/2016.
 */
public class Person {

    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String IsAdult() {
        if (this.age >= 18) return "Yes";
        else return "No";

    }
}
