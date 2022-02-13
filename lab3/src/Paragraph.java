public class Paragraph implements Element{
    private final String text;

    public Paragraph(String text){
        this.text = text;
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

    public void print(){
        System.out.println(this.text);
    }
}
