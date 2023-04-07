package phm.chassiplataforma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import phm.chassiplataforma.entities.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByMail(String mail);
}
