package shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopping.db.MenuSubEntity;

public interface MenuSubRepository extends JpaRepository<MenuSubEntity,String> {

}
