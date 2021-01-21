package shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopping.db.OptionMenuEntity;
import shopping.model.home.OptionMenu;

public interface OptionMenuRepository extends JpaRepository<OptionMenuEntity,String> {
    OptionMenuEntity findByoptionmenuList(String optionmenu);
}
