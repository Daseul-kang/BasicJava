package chapter08.example;

public abstract class Book {
    private int number;
    private String title;
    private String author;
    private static int countOfBooks = 1;

    public Book(String title, String author) {
        this.title = title;
        this. author = author;
        number = countOfBooks;
        countOfBooks++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLateFee(int lateDay);

    @Override
    public boolean equals(Object o) {
        // 선생님의 왕 간단한 답
        if (this == o) {
            return true;
        }
        //Book으로 캐스팅 할 수 있는지 확인하고 캐스팅을 해줘야 됨,,
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return title.equals((book.title)) && author.equals(book.author);
        /*
        내가 쓴 답
        return this.title.equals(((Book)o).getTitle())
               && this.author.equals(((Book)o).getAuthor());
        */
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return String.format("관리 번호: %d번, 책 제목: %s, 저자: %s, (일주일 연체료: %,d원)", number, title, author, getLateFee(7));
    }

}
