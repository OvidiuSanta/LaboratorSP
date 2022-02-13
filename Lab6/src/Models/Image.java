package Models;
import Services.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture, Visitee {
    private String imageName;
    private Dimension dim = new Dimension(800,800);
    private ImageLoader lodaer;
    private ImageLoaderFactory imageLoaderFactory = new ImageLoaderFactory();

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        }
        catch( InterruptedException e) { e.printStackTrace(); }
    }
    public Image(Image image) {
        this.imageName = image.imageName;
    }

    public void add(Element element) {}
    public void remove(Element element) {}

    @Override
    public boolean find(Element element) {
        if (!(element instanceof Image))
            return false;
        else {
            return ((Image) element).imageName.equals(this.imageName);
        }
    }

    public String url() {
        return this.imageName;
    }
    public Dimension dim() {
        return this.dim;
    }
    public void loadContent() throws Exception {
        lodaer = imageLoaderFactory.create(imageName);
    }
    public String getImageName() {
        return imageName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}
