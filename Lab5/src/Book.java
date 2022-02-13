import java.util.ArrayList;

public class Book {
    private String name;
   //private ArrayList<Section> sections;
    private ArrayList<Element> elements;
    private ArrayList<Author> authors; //o carte are mai multi autori


    //constructor
    public Book(String name) {
        this.name = name;
        //this.sections = new ArrayList<Section>();
        this.elements = new ArrayList<Element>();
        this.authors = new ArrayList<Author>();
    }

    public  void addAuthor(Author author){
        this.authors.add(author);
    }
    //public int createChapter (String chapter){
    //     this.sections.add(new Section(chapter));
    //     return this.sections.size() - 1;//adaugam doar la coada
    // }
    // public Section getChapter(int index){
    //     return this.sections.get(index);
    // }
    public void addContent (Element element) {
        this.elements.add(element);
    }

    public void print(){
        System.out.println("Titlu carte" + this.name);
        System.out.println("Autori");
        for(Author i : this.authors)
            i.print();
        for(Element i : this.elements)
            i.print();
    }
}