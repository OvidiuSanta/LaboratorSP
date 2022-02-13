import java.util.ArrayList;
import java.util.Iterator;

public class Subchapter {
    private String name;
    private ArrayList<Element> elements;

    public Subchapter(String name) {
        this.name = name;
        this.elements = new ArrayList();
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }

    public void print() {
        System.out.println(this.name);
        Iterator var1 = this.elements.iterator();

        while(var1.hasNext()) {
            Element i = (Element)var1.next();
            i.print();
        }

    }
}