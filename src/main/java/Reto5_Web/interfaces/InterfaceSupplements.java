
package Reto5_Web.interfaces;


import Reto5_Web.modelo.Supplements;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface InterfaceSupplements extends MongoRepository<Supplements, String> {
     public List<Supplements> findByPrice(double price);
    public List<Supplements> findByDescriptionContainingIgnoreCase(String description);
    
}
