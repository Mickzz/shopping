package shopping.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Entity(name = "submenu")
public class SubMenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private List<String> subMenuList;

    public SubMenuEntity(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<String> subMenuList) {
        this.subMenuList = subMenuList;
    }
}
