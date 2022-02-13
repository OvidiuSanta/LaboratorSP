package Models;
import Services.*;

public class Paragraph implements Element, Visitee {
    private final String text;
    private AlignStrategy align;

    public Paragraph(String text){
        this.text = text;
    }
    public Paragraph(Paragraph paragraph) {
        this.text = paragraph.text;
    }

    public void add(Element element) {}
    public void remove(Element element) {}
    public boolean find(Element element) {
        if (!(element instanceof Paragraph))
            return false;
        else {
            return ((Paragraph) element).text.equals(this.text);
        }
    }
    public void setAlign(AlignStrategy align) {
        this.align= align;
    }
    public String getText() {
        return text;
    }
    public AlignStrategy getAlignStrategy() {
        return align;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
