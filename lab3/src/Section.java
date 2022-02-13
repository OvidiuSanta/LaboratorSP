import java.util.ArrayList;
public class Section implements Element{
    private String title;
    private ArrayList<Element> elements;

    public Section(String title){
        this.title=title;
        this.elements = new ArrayList<Element>();
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

    public void print(){
        System.out.println(this.title);
        for (Element i : this.elements)
            i.print();
    }
}
