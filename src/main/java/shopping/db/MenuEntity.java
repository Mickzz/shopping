package shopping.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "menu")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private SubMenuEntity subMenu;
    private OptionMenuEntity optionMenu;

    public MenuEntity(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubMenuEntity getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(SubMenuEntity subMenu) {
        this.subMenu = subMenu;
    }

    public OptionMenuEntity getOptionMenu() {
        return optionMenu;
    }

    public void setOptionMenu(OptionMenuEntity optionMenu) {
        this.optionMenu = optionMenu;
    }
}
