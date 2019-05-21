package items.camera;

import items.Battery;
import items.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Обычная камера
 */
public class Camera extends Item<Camera> {

    private CameraStatus status = CameraStatus.WORKING;
    List<Battery> batteries = new ArrayList<>();
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

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void addBattery(Battery battery) {
        batteries.add(battery);
    }

    @Override
    public Camera storage() {
        System.out.println("Храни меня аккуратно!");
        return this;
    }
}
