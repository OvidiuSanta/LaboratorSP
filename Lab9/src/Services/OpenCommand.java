package Services;

import Models.*;

public class OpenCommand implements Command{

    private String BookTitle;

    public OpenCommand(String BookTitle){
        this.BookTitle = BookTitle;
    }

    @Override
    public void execute() throws Exception {
        Book book = new Book(this.BookTitle);
        book.addAuthor( new Author("Radu"));
        book.addAuthor( new Author("Alin"));
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Table("Table 1"));
        book.addContent(cap1);

        DocumentManager.getInstance().setBook(book);
    }
}
