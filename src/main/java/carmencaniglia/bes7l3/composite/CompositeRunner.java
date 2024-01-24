package carmencaniglia.bes7l3.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {

        Author dante = new Author("Dante Alighieri");
        Author giacomo = new Author("Giacomo Leopardi");

        BookComponent page1 = new SinglePage();
        BookComponent page2 = new SinglePage();
        BookComponent page3 = new SinglePage();
        BookComponent page4 = new SinglePage();
        Section section1 = new Section();
        section1.addComponent(page1);
        section1.addComponent(page2);
        Section section2 = new Section();
        section2.addComponent(page3);
        section2.addComponent(page4);

        Book book = new Book(39.99);
        book.addAuthor(dante);
        book.addAuthor(giacomo);
        book.addComponent(section1);
        book.addComponent(section2);

        book.print();
        System.out.println("Total page count: " + book.getPagesNumber());

    }
}
