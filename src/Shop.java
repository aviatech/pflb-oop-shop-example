import exception.BrokenCameraException;
import items.Battery;
import items.Item;
import items.camera.Camera;
import items.camera.CameraStatus;
import items.camera.Manufacturer;
import store.Storagable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Псевдо-магазин
 */
public class Shop {

    private static long balance;
    private static Collection<Storagable> storage = new ArrayList<>();
    private static Collection<Camera> cameras;

    static {
        Camera camera = new Camera("Canon D3", 100, 100, 1000, 800);
        Camera camera1 = new Camera("Canon D4", 100, 100, 1000, 800);
        Camera camera2 = new Camera("Canon D5", 100, 100, 1000, 800);
        Camera camera3 = new Camera("Canon D6", 100, 100, 1000, 800);

        Manufacturer duracell = new Manufacturer("Дюрасел");
        Manufacturer philips = new Manufacturer("Филипс");

        camera1.addBattery(new Battery("Дюрасел ААА", 50, 10, duracell));
        camera1.addBattery(new Battery("Дюрасел ААА", 50, 10, duracell));
        camera2.addBattery(new Battery("Филипс ААА", 50, 10, philips));

        cameras = Arrays.asList(camera, camera1, camera2, camera3);
    }

    public static void main(String[] args) {

        List<String> batteries = cameras
                .stream()
                .flatMap(camera -> camera.getBatteries().stream())
                .map(Battery::getManufacturer)
                .filter(Objects::nonNull)
                .map(Manufacturer::getName)
                .collect(Collectors.toList());
        System.out.println(batteries);
    }

    public static Collection<String> collectManufactoriesNamesFromCameras(Collection<Camera> cameras) {
        Collection<Battery> batteries = new ArrayList<>();
        Collection<String> manufactorurerNames = new ArrayList<>();
        for (Camera camera : cameras) {
            batteries.addAll(camera.getBatteries());
        }
        for (Battery battery : batteries) {
            Manufacturer manufacturer = battery.getManufacturer();
            if (manufacturer != null) {
                manufactorurerNames.add(manufacturer.getName());
            }
        }

        return manufactorurerNames;
    }

    public static void repair(Camera camera) {
        System.out.println("Прибыла камера на починку!");
    }

    public static void addToStorage(Collection<Storagable> pack) {
        System.out.println("Добавлена партия вещей на склад!");
        storage.addAll(pack);
    }

    public static void addToStorage(Storagable storagableThing) {
        storagableThing.storage();
        System.out.println("Добавлен новая вещь на склад: " + storagableThing.getName());
        storage.add(storagableThing);
    }

    public static void sell(Item item) {
        balance += item.calcProfit();
    }

    public static void useCamera(final Camera camera) {
        if (!camera.getStatus().equals(CameraStatus.WORKING)) {
            throw new BrokenCameraException(camera);
        }
        camera.makePhoto();
    }

    public static void printBalance() {
        System.out.println("Our balance is " + balance);
    }
}
