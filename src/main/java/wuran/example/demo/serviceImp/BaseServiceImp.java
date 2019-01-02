package wuran.example.demo.serviceImp;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import wuran.example.demo.service.BaseService;

import java.util.List;
public abstract class BaseServiceImp<T,ID> implements BaseService<T,ID>, InitializingBean {
    protected JpaRepository<T,ID> repository;
    protected abstract void setRepository();
    public BaseServiceImp(){
    }
    public boolean add(T t){
        boolean result=true;
        T temp=repository.save(t);
        if(temp==null){

        }
        return result;
    }
    public boolean update(T t){
        boolean result=true;
        T temp=repository.save(t);
        if(temp==null){

        }
        return result;
    }
    public void delete(T t){
        repository.delete(t);
    }
    public void deleteById(ID id){
        repository.deleteById(id);
    }
    public List<T> getAll(){
        return repository.findAll();
    }
    public T get(ID id){
         return repository.findById(id).get();
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        setRepository();
    }
}
