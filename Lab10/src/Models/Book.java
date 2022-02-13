package Models;
import Services.*;
import java.util.ArrayList;

public class Book implements Visitee{
    private String name;
    private ArrayList<Element> elements;
    private ArrayList<Author> authors; //o carte are mai multi autori


    //constructor
    public Book(String name) {
        this.name = name;
        this.elements = new ArrayList<Element>();
        this.authors = new ArrayList<Author>();
    }

    public  void addAuthor(Author author){
        this.authors.add(author);
    }
    public void addContent (Element element) {
        this.elements.add(element);
    }
    public String getBookName() {
        return name;
    }
    public ArrayList<Element> getElements() {
        return elements;
    }
    public ArrayList<Author> getAuthors() {
        return authors;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}