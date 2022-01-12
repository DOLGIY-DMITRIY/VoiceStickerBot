package bot.storage;

public interface Storage<T> {

    public void add(T object);

    public void delete(T object);

    public T get(long id);
}
