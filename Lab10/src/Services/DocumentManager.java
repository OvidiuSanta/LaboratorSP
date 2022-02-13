package Services;
import Models.*;

public class DocumentManager {
    private Book book;
    private static DocumentManager instance;//instanta este de tipul clasei pt a fi unica

    private DocumentManager(){
    }

    public static DocumentManager getInstance() {
        if(instance==null)
            instance=new DocumentManager();
        return instance;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book=book;
    }
}
