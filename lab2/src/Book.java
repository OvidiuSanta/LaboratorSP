import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    private String name;
    private ArrayList<Chapter> chapters;
    private ArrayList<Author> authors;
    private TableOfContents tableOfContents;

    public Book(String name) {
        this.name = name;
        this.chapters = new ArrayList();
        this.authors = new ArrayList();
        this.tableOfContents = new TableOfContents();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int createChapter(String chapter) {
        this.chapters.add(new Chapter(chapter));
        return this.chapters.size() - 1;
    }

    public Chapter getChapter(int index) {
        return (Chapter)this.chapters.get(index);
    }

    public void print() {
        System.out.println(this.name);
        Iterator var1 = this.authors.iterator();

        while(var1.hasNext()) {
            Author i = (Author)var1.next();
            i.print();
        }

        this.tableOfContents.print();
        var1 = this.chapters.iterator();

        while(var1.hasNext()) {
            Chapter i = (Chapter)var1.next();
            i.print();
        }

    }
}