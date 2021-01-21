package shopping.db;

import javax.persistence.*;

@Entity(name = "submenu")
public class SubMenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String submenuList;
    @OneToOne(mappedBy = "subMenu")
    private MenuSubEntity menu;

    public SubMenuEntity(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubmenuList() {
        return submenuList;
    }

    public void setSubmenuList(String submenuList) {
        this.submenuList = submenuList;
    }

    public MenuSubEntity getMenu() {
        return menu;
    }

    public void setMenu(MenuSubEntity menu) {
        this.menu = menu;
    }
}
