import java.util.ArrayList;
import java.util.Iterator;

public class Chapter {
    private String title;
    private ArrayList<Subchapter> Subchapters;

    public Chapter(String title) {
        this.title = title;
        this.Subchapters = new ArrayList();
    }

    public int createNewSubchapter(String subchapter) {
        this.Subchapters.add(new Subchapter(subchapter));
        return this.Subchapters.size() - 1;
    }

    public Subchapter getSubchapter(int index) {
        return (Subchapter)this.Subchapters.get(index);
    }

    public void print() {
        System.out.println(this.title);
        Iterator var1 = this.Subchapters.iterator();

        while(var1.hasNext()) {
            Subchapter i = (Subchapter)var1.next();
            i.print();
        }

    }
}