package chapter08.example;

public class ScienceFiction extends Book{

    public ScienceFiction(String title, String author) {
        super(title, author);
    }
    @Override
    public int getLateFee(int lateDay) {
        return lateDay * 600;
    }
}
