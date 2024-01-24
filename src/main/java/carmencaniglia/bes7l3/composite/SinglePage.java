package carmencaniglia.bes7l3.composite;

public class SinglePage implements BookComponent{
    @Override
    public int getPagesNumber() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Single Page");
    }
}
