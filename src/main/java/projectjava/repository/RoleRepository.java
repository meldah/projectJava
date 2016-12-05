package projectjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectjava.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {

    Role findByName(String name);
}
