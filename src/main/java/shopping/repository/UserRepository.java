package shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopping.db.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,String> {
    UserEntity findByfirstname(String user);
}
