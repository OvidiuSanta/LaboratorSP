package Services;
import Models.*;

public class RenderContentVisitor implements Visitor{
    @Override
    public void visitBook(Book book) {
        System.out.println("Book: " + book.getBookName());
        System.out.println("Author: ");
        for (Author i : book.getAuthors())
            i.print();
        for (Element i : book.getElements()) {
            Visitee castedI = (Visitee) i;
            castedI.accept(this);
        }
    }

    @Override
    public void visitSection(Section section) {
        System.out.println("Section title: " + section.getSectionTitle());
        for (Element i : section.getElements()) {
            Visitee castedI = (Visitee) i;
            castedI.accept(this);
        }
    }
    @Override
    public void visitTableOfContents(TableOfContents tableofcontents) {
            System.out.println("Table Of Contents");
        }


    @Override
    public void visitParagraph(Paragraph paragraph) {
        if (paragraph.getAlignStrategy() != null) {
            paragraph.getAlignStrategy().render(paragraph, null);
        }
        else
            System.out.println("Paragraph: " + paragraph.getText());
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        System.out.println("Image proxy:" + imageProxy.getUrl() + "dimension:" + imageProxy.getDim());
        Image currentImg = imageProxy.LoadImage();
        visitImage(currentImg);
    }

    @Override
    public void visitImage(Image image) {
        System.out.println(image.getImageName());
    }

    @Override
    public void visitTable(Table table) {
        System.out.println(table.getTitle());
    }
}
