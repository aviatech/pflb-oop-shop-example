import items.Battery;
import items.Item;
import items.camera.Camera;
import items.camera.CameraStatus;
import office.Table;
import store.Storagable;

/**
 * Псевдо-магазин
 */
public class Shop {

    private static long balance;

    public static void main(String[] args) {
        Camera camera = new Camera("Canon D3", 100, 100, 1000, 800);
        sell(camera);

        Battery battery = new Battery("Дюрасел ААА", 50, 10);
        sell(battery);
        printBalance();

        Table table = new Table("red");

        add(camera);
        add(battery);
        add(table);
    }

    public static void add(Storagable storagableThing) {
        storagableThing.storage();
        System.out.println("Добавлен новая вещь на склад: " + storagableThing.getName());
    }

    public static void sell(Item item) {
        balance += item.calcProfit();
    }

    public static void useCamera(final Camera camera) {
        if (!camera.getStatus().equals(CameraStatus.WORKING)) {
            System.out.println("It's broken!");
            return;
        }
        camera.makePhoto();
    }

    public static void printBalance() {
        System.out.println("Our balance is " + balance);
    }
}

