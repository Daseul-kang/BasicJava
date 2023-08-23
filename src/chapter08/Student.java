package chapter08;

public class Student implements Comparable<Student> {
    //<Student> 제네릭? comparTo 인터페이스 메소드 구현 시 캐스팅을 하지 않아도 되서 깔끔해진다.
    private String name;
    private int studentNo;
    private int age;

    public Student(String name, int studentNo, int age) {
        this.name = name;
        this.studentNo = studentNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("이룸: %s, 학번: %d 나이: %d\n", name, studentNo, age);
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > (o.age)) {
            return 1;
        } else if (this.age < (o.age)) {
            return -1;
        } else {
            return 0;
        }

        //sort를 쓰기위해 compareTo 라는 메소드를 구현한 것이다!!
//    @Override
//    public int compareTo(Object o) {
//        if (this.age > (((Student) o).age)) {
//            return 1;
//        } else if (this.age < (((Student) o).age)) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }

    }
}
