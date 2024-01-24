package carmencaniglia.bes7l3.composite;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookComponent{
    private List<Author> authors = new ArrayList<>();
    private double price;
    private List<BookComponent> components = new ArrayList<>();

    public Book(double price) {
        this.price = price;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addComponent(BookComponent component) {
        components.add(component);
    }

    @Override
    public int getPagesNumber() {
        return components.stream().mapToInt(BookComponent::getPagesNumber).sum();
    }

    @Override
    public void print() {
        System.out.println("Book");
        System.out.println("Authors:");
        authors.forEach(a -> System.out.println(" - " + a.getName()));
        System.out.println("Price: " + price);
        System.out.println("Contents:");
        components.forEach(BookComponent::print);
    }
}
