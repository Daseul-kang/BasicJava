package chapter12;

public class PeopleExample {
    public static void main(String[] args) {
        People people = new People();
        people.setSsn("1234");
        people.setAge(34);
        System.out.println(people.toString());
    }
}
