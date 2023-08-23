package chapter12;

import java.util.Objects;

public class Student {
    private int num;
    private String name;

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Student() {

    }

    public int getAge() {
        return num;
    }

    public void setAge(int age) {
        this.num = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return num == student.num && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }


}


//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if(!(obj instanceof Student)) {
//            return false;
//        }
//        Student student = (Student) obj;
//        return Objects.equals(num, student.num) && Objects.equals(name, student.name);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(num, name);
//    }
//}

