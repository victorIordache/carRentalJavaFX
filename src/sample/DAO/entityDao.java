package sample.DAO;

import java.util.List;

public interface entityDao<T> {

    List<T> findAll();

    T findById(int itemId);

    void create(T item);

    void update(T item);

    void remove(T item);

    void remove(int itemId);
}
