package items.camera;

/**
 * Камера-палароид - снимает и сразу печатает фото
 */
public class Palaroid extends Camera {

    public Palaroid(String name, int width, int height, int price, int byingPrice, String taxClass) {
        super(name, width, height, price, byingPrice, taxClass);
    }

    @Override
    public void makePhoto() {
        super.makePhoto();
        System.out.println("Printing ... done");
    }
}
