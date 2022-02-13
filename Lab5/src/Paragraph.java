public class Paragraph implements Element{
    private final String text;
    private AlignStrategy align;

    public Paragraph(String text){
        this.text = text;
    }
    public void setAlignStrategy(AlignStrategy strat)
    {
        this.align=strat;
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

    public void print() {
        if (this.align != null) {
            this.align.render(this, null);
        }
        else
            System.out.println("Paragraph" + this.text);
    }
}
