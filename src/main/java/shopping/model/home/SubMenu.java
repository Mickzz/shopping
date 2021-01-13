package shopping.model.home;

import java.util.List;

public class SubMenu {
    private String id;
    private List<String> subMenuList;

    public SubMenu(){
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
