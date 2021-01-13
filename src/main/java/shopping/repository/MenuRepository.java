package shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopping.db.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity,String> {
}
