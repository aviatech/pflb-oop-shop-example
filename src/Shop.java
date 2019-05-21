import exception.BrokenCameraException;
import items.Battery;
import items.Item;
import items.camera.Camera;
import items.camera.CameraStatus;
import office.Table;
import store.Storagable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Псевдо-магазин
 */
public class Shop {

    private static long balance;
    private static Collection<Storagable> storage = new ArrayList<>();

    public static void main(String[] args) {
        Camera camera = new Camera("Canon D3", 100, 100, 1000, 800);
        sell(camera);

        Battery battery = new Battery("Дюрасел ААА", 50, 10);
        sell(battery);
        printBalance();

        Table table = new Table("red");
        Collection<Storagable> pack = new ArrayList<>();
        pack.add(camera);
        pack.add(battery);
        pack.add(table);
        addToStorage(pack);


        System.out.println(Shop.storage);
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

