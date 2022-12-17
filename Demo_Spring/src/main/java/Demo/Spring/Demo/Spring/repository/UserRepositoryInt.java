package Demo.Spring.Demo.Spring.repository;

import Demo.Spring.Demo.Spring.modele.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInt extends JpaRepository<User, Long> {
}
