package Services;

import Models.*;

public class CountContentVisitor implements Visitor{
    private int BookCounter = 0;
    private int SectionCounter = 0;
    private int ImageCounter = 0;
    private int ImageProxyCounter = 0;
    private int ParagraphCounter = 0;
    private int TableCounter = 0;
    private int TableOfContCounter = 0;


    @Override
    public void visitBook(Book book) {
        for (Element i : book.getElements())
        {
            Visitee casted = (Visitee) i;
            casted.accept(this);
        }
        BookCounter++;
    }
    @Override
    public void visitSection(Section section) {
        for (Element i : section.getElements())
        {
            Visitee casted = (Visitee) i;
            casted.accept(this);
        }
        SectionCounter++;
    }
    @Override
    public void visitTableOfContents(TableOfContents tableofcontents) {
        TableOfContCounter++;
    }
    @Override
    public void visitParagraph(Paragraph paragraph) {
        ParagraphCounter++;
    }
    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        ImageProxyCounter++;
    }
    @Override
    public void visitImage(Image image) {
        ImageCounter++;
    }
    @Override
    public void visitTable(Table table) {
        TableCounter++;
    }

    public void showStatistics() {
        System.out.println("Books visited: " + BookCounter);
        System.out.println("Sections visited: " + SectionCounter);
        System.out.println("Images visited: " + ImageCounter);
        System.out.println("Image proxies visited: " + ImageProxyCounter);
        System.out.println("Paragraphs visited: " + ParagraphCounter);
        System.out.println("Tables visited: " + TableCounter);
    }

}
