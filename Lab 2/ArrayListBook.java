import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListBook {
    private String bookName;
    private String publisher;
    private double price;

    public ArrayListBook(String bookName, String publisher, double price ){
        this.bookName = bookName;
        this.publisher = publisher;
        this.price = price;
        
    }

    @Override
    public String toString() {
        return "ArrayListBook [bookName=" + bookName + ", publisher=" + publisher + ", price=" + price + "]";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        ArrayList<ArrayListBook> b1 = new ArrayList<>();
        b1.add(new ArrayListBook("Book1", "Satish", 25.99));
        b1.add(new ArrayListBook("Book4", "Vikas", 19.99));
        b1.add(new ArrayListBook("Book2", "Yuvraj", 15.99));
        b1.add(new ArrayListBook("Book3", "Chankit", 13.99));

        // sorting according to price
        Collections.sort(b1, Comparator.comparing(ArrayListBook::getPrice));
        System.out.println("Books sorted by price: " + b1 + "\n");

        // sorting according to name
        Collections.sort(b1, Comparator.comparing(ArrayListBook::getBookName));
        System.out.println("Books sorted by name: " + b1 + "\n");
    }
}