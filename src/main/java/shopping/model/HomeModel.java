package shopping.model;

import shopping.model.home.Menu;
import shopping.model.home.SubMenu;

import java.util.List;

public class HomeModel {

    private List<Menu> menuList;
    private List<SubMenu> subMenuList;

    public HomeModel(){
        super();
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public List<SubMenu> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<SubMenu> subMenuList) {
        this.subMenuList = subMenuList;
    }
}
