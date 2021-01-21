package shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopping.db.SubMenuEntity;

public interface SubMenuRepository extends JpaRepository<SubMenuEntity,String> {
    SubMenuEntity findBySubmenuList(String submenu);
}
