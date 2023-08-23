package chapter08.example;

public class Poet extends Book{
    public Poet (String title, String author) {
        super(title, author);
    }

    @Override
    public int getLateFee(int lateDay) {
        return lateDay *200;
    }
}
