public class BMPImageLoader implements ImageLoader{
    private String imageName;

    public BMPImageLoader(String imageName) {
        this.imageName = imageName;
    }

    public void load(String str) {
        System.out.println("BMP Image: " + imageName);
    }
}
