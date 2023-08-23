package chapter12.confirmation;

public class Member06 {
    private String id;
    private String name;

    public Member06(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
