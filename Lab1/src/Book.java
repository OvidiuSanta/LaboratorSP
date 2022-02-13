import java.util.ArrayList;
import java.util.List;

public class Book {
    public String name;
    public List<String> paragraph;
    public List<String> image;
    public List<String> table;

    //constructor
    public Book(String name) {
        this.name = name;
        this.paragraph = new ArrayList<>();
        this.image = new ArrayList<>();
        this.table = new ArrayList<>();
    }

    public void createNewParagraph(String paragraf){ paragraph.add(paragraf);}

    public void createNewImage(String imagine){
        image.add(imagine);
    }

    public void createNewTable(String tabel){
        table.add(tabel);
    }


    public void print(){
        System.out.println(paragraph);
        System.out.println(image);
        System.out.println(table);
    }
}