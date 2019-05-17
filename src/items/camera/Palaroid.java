package items.camera;

/**
 * Камера-палароид - снимает и сразу печатает фото
 */
public class Palaroid extends Camera {

    Palaroid(String name, int width, int height, int price, int byingPrice) {
        super(name, width, height, price, byingPrice);
    }

    @Override
    public void makePhoto() {
        super.makePhoto();
        System.out.println("Printing ... done");
    }
}
