package shopping.db;

import javax.persistence.*;

@Entity (name="menu")
public class MenuSubEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String submenuId;
    @OneToOne
    @JoinTable(name = "submenu",
        joinColumns =
                {
                        @JoinColumn(name = "submenu_id", referencedColumnName = "id")
                }

    )
    private SubMenuEntity subMenu;

    public MenuSubEntity() {
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

    public String getSubmenuId() {
        return submenuId;
    }

    public void setSubmenuId(String submenuId) {
        this.submenuId = submenuId;
    }

    public SubMenuEntity getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(SubMenuEntity subMenuEntity) {
        this.subMenu = subMenuEntity;
    }
}

