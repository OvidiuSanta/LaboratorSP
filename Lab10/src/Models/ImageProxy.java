package Models;
import Services.*;

public class ImageProxy implements Element, Picture, Visitee {
    private String url;
    private Dimension dim = new Dimension(800, 800);
    private Image img;

    public ImageProxy(String url) {
        this.url = url;
    }
    public ImageProxy(ImageProxy imageProxy) {
        this.url = imageProxy.url;
        this.dim = imageProxy.dim;
        this.img = imageProxy.img;
    }


    public Image LoadImage() { //
        if (this.img == null) {//verificam daca imaginea este deja incarcata pentru a nu o incarca de mai multe ori
            this.img = new Image(url);
        }

        return this.img;
    }
    public void add(Element element) {}
    public void remove(Element element) {}
    public boolean find(Element element){
        return false;
    }
    public String url() {
        return null;
    }
    public Dimension dim() {
        return null;
    }
    public String getUrl() {
        return url;
    }
    public Dimension getDim() {
        return dim;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
