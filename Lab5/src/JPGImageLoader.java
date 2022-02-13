public class JPGImageLoader implements ImageLoader{
    private String imageName;

    public JPGImageLoader(String imageName) {
        this.imageName = imageName;
    }

    public void load(String str) {
        System.out.println("JPG Image: " + str);
    }
}
