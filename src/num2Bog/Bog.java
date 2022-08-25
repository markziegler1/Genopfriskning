package num2Bog;

public class Bog {
    private int ISBN;
    private String title;
    private int year;

    public Bog(int ISBN, String title, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
