package Demo.Spring.Demo.Spring.service;

import Demo.Spring.Demo.Spring.modele.User;

import java.util.List;

public interface UserServiceInt {

    User createUser(User user);

    List<User> getUsers();
}
