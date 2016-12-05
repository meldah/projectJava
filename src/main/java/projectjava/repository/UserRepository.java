package projectjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectjava.entity.User;


/**
 * Created by user on 12/5/2016.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}

