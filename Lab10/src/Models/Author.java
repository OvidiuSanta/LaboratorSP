package Models;

public class Author {
    private String name;

    //constructor
    public Author(String name){
        this.name = name;
    }

    public void print(){
        System.out.println(this.name);
    }
}
