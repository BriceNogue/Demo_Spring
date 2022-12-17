package Demo.Spring.Demo.Spring.service;

import Demo.Spring.Demo.Spring.modele.User;
import Demo.Spring.Demo.Spring.repository.UserRepositoryInt;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements UserServiceInt{

    private final UserRepositoryInt userRepositoryInt;

    @Override
    public User createUser(User user) {
        return userRepositoryInt.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepositoryInt.findAll();
    }
}
