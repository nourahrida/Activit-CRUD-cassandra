package ma.enest.cassandea.CRUD.service;

import ma.enest.cassandea.CRUD.model.User;
import ma.enest.cassandea.CRUD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(String name, String email) {
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setName(name);
        user.setEmail(email);
        return userRepository.save(user);
    }
    public User getUser(UUID id) {
        return userRepository.findById(id).get();
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}