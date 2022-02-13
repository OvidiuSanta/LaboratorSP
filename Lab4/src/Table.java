public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
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

    public void print() {
        System.out.println(this.title);
    }
}
