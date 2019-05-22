package store;

public interface Storagable<T> {

    String getName();

    T storage();

}
