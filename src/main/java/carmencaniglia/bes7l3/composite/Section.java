package carmencaniglia.bes7l3.composite;

import java.util.ArrayList;
import java.util.List;

public class Section implements BookComponent{
    private List<BookComponent> components = new ArrayList<>();

    public void addComponent(BookComponent component) {
        components.add(component);
    }

    @Override
    public int getPagesNumber() {
        return components.stream().mapToInt(BookComponent::getPagesNumber).sum();
    }

    @Override
    public void print() {
        System.out.println("Section:");
        components.forEach(BookComponent::print);
    }
}
