import items.food.Cookie;
import items.Battery;
import items.Item;
import items.camera.Camera;
import items.camera.CameraStatus;
import office.Table;
import store.Storable;

/**
 * Псевдо-магазин
 */
public class Shop {

    private static long balance;

    public static void main(String[] args) {
        Camera camera = new Camera("Canon D3", 100, 100, 1000, 800,"1");
        sell(camera);

        Battery battery = new Battery("Дюрасел ААА", 50, 10, "2");
        sell(battery);


        Table table = new Table("red");

        Cookie cookie = new Cookie("Oreo", 40);

        add(camera);
        add(battery);
        add(table);

        getPurchase(cookie);
        printBalance();
        buyToStorage(camera);

    }

    public static void add(Storable storableThing) {
        storableThing.store();
        System.out.println("Добавлен новая вещь на склад: " + storableThing.getName());
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

    public static void getPurchase(Item item) {
        balance -= item.getPurchasePrice();
    }

    public static void buyToStorage(Item item) {
         getPurchase(item);
         add(item);
     }


    public static void printBalance() {
        System.out.println("Our balance is " + balance);
    }

}

