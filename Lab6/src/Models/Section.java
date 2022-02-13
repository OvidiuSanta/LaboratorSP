package Models;
import Services.*;
import java.util.ArrayList;
import java.util.Collections;

public class Section implements Element,Visitee {
    private String title;
    private ArrayList<Element> elements;

    public Section(String title){
        this.title=title;
        this.elements = new ArrayList<Element>();
    }
    public Section(Section section) {
        this.title = section.title;
        this.elements = new ArrayList<>();
        Collections.copy(this.elements, section.elements);
    }

    public void add(Element element) throws Exception {
        for (Element i : this.elements)
            if (i.find(element))
                throw new Exception("Unsupported Operation");

        this.elements.add(element);
    }
    public void remove(Element element) {
        this.elements.remove(element);
    }
    public boolean find(Element element) {
        for (Element i : this.elements) {
            if (i.find(element))
                return true;
        }
        return false;
    }
    public String getSectionTitle() {
        return title;
    }
    public ArrayList<Element> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }
}
