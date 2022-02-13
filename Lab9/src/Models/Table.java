package Models;
import Services.*;

public class Table implements Element, Visitee {
    private String title;

    public Table(String title) {
        this.title = title;
    }
    public Table(Table table) {
        this.title = table.title;
    }

    public void add(Element element) {}
    public void remove(Element element) {}
    public boolean find(Element element) {
        if (!(element instanceof Table))
            return false;
        else {
            return ((Table) element).title.equals(this.title);
        }
    }
    public String getTitle() {
        return title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
