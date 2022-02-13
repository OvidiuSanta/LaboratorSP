package Models;

import Services.*;

public class TableOfContents implements Element, Visitee {

    public void add(Element element) {}
    public void remove(Element element) {}
    public boolean find(Element element){
        return false;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}
