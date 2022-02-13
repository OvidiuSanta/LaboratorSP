import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
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

    public void add(Element element) {}
    public void remove(Element element) {}
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

    public void print() {
        System.out.println(this.imageName);
    }
}
