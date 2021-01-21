package shopping.model.home;

import java.util.List;

public class OptionMenu {
    private String id;
    private List<Object> optionmenuList;

    public OptionMenu(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getOptionMenuList() {
        return optionmenuList;
    }

    public void setOptionMenuList(List<Object> optionMenuList) {
        this.optionmenuList = optionMenuList;
    }
}
