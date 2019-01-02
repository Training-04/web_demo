package wuran.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaseService<T,ID> {
    boolean add(T t);
    boolean update(T t);
    void delete(T t);
    void deleteById(ID id);
    List<T> getAll();
    T get(ID id);

}
