package dao;

import java.util.List;

public interface Dao<T> {

    void save(T t);

    List<T> getAll();

    T get(long id);

    void delete(T t);

    void update(T t);

}