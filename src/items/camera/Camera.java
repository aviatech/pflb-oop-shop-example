package items.camera;

import items.Item;

/**
 * Обычная камера
 */
public class Camera extends Item {

    private CameraStatus status = CameraStatus.WORKING;
    private int width;
    private int height;

    public Camera(String name, int width, int height, int price, int byingPrice) {
        super(name, price, byingPrice);
        this.width = width;
        this.height = height;
    }

    public CameraStatus getStatus() {
        return status;
    }

    public void makePhoto() {
        System.out.println("Click!");
    }

    public void setStatus(CameraStatus status) {
        this.status = status;
    }

    @Override
    public int getTaxes() {
        return 10;
    }

    @Override
    public void storage() {
        System.out.println("Храни меня аккуратно!");
    }
}
