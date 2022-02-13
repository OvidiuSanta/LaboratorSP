package Models;

public interface Element {
    void add(Element element) throws Exception;
    void remove(Element element);
    boolean find(Element element);
}
