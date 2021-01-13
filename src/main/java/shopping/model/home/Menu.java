package shopping.model.home;

public class Menu {
    private String id;
    private String name;
    private SubMenu subMenu;
    private OptionMenu optionMenu;

    public Menu(){
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

    public SubMenu getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(SubMenu subMenu) {
        this.subMenu = subMenu;
    }

    public OptionMenu getOptionMenu() {
        return optionMenu;
    }

    public void setOptionMenu(OptionMenu optionMenu) {
        this.optionMenu = optionMenu;
    }
}
