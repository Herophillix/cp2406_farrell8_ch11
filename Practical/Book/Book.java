package Book;

public abstract class Book {
    private String title;
    protected double price;

    public Book(String title) {
        this.title = title;
        SetPrice();
    }

    public String GetTitle() {
        return title;
    }
    public double GetPrice() {
        return price;
    }

    public abstract void SetPrice();

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}