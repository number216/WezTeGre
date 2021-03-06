package pl.weztegre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weztegre.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByNick(String nick);
    User findByEmail(String email);
}
