package Reto5_Web.repositorio;

import Reto5_Web.interfaces.InterfaceSupplements;
import Reto5_Web.modelo.Supplements;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SupplementsRepositorio {
    @Autowired
    private InterfaceSupplements repository;

    public List<Supplements> getAll() {
        return repository.findAll();
    }

    public Optional<Supplements> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Supplements create(Supplements clothe) {
        return repository.save(clothe);
    }

    public void update(Supplements clothe) {
        repository.save(clothe);
    }
    
    public void delete(Supplements clothe) {
        repository.delete(clothe);
    }
    
    /////
    public List<Supplements> getByPrice(double price){
        return repository.findByPrice(price);
    }

    public List<Supplements> getByDescriptionContains(String description){
        return repository.findByDescriptionContainingIgnoreCase(description);
    }
}
