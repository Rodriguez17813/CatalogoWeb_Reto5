package Reto5_Web.repositorio;

import Reto5_Web.interfaces.InterfaceUser;
import Reto5_Web.modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepositorio {

    /**
     *
     * Metodo para listar todos los usuarios
     */
    @Autowired
    private InterfaceUser userCrudRepository;

    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    /**
     *
     * Metodo para buscar un usuario
     */
    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }

    /**
     *
     * Metodo para crear un usuario
     */
    public User create(User user) {
        return userCrudRepository.save(user);
    }

    /**
     *
     * Metodo para actualizar un usuario
     */
    public void update(User user) {
        userCrudRepository.save(user);
    }

    /**
     *
     * Metodo para eliminar un usuario
     */
    public void delete(User user) {
        userCrudRepository.delete(user);
    }

    /**
     *
     * Metodo para validar un email de usuario
     */
    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);

        return !usuario.isEmpty();
    }

    /**
     *
     * Metodo para validar autenticacion de un usuario
     */
    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

    //
    /**
     *
     * Metodo para buscar usuarios por fecha cumpleaños
     */
    public List<User> getByMonthBirthDay(String month) {
        return userCrudRepository.findByMonthBirthtDay(month);
    }
}
