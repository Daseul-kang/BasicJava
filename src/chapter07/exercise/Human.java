package chapter07.exercise;

public class Human {
    private String name;
    private int age;

    // boilerplate code => lombok @Data .?.... 뭘 하면 된댜....

    public Human() {
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "이름: " + name + ",나이: " + age;
    }
}
