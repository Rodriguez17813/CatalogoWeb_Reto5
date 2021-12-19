
package Reto5_Web.interfaces;

import Reto5_Web.modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface InterfaceUser extends MongoRepository<User, Integer> {
     Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    Optional<User> findByNameOrEmail(String name, String email);
    List<User> findByMonthBirthtDay(String month);
}
