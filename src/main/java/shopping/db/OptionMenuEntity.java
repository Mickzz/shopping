package shopping.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Entity(name = "option")
public class OptionMenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private List<Object> optionMenuList;

    public OptionMenuEntity(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getOptionMenuList() {
        return optionMenuList;
    }

    public void setOptionMenuList(List<Object> optionMenuList) {
        this.optionMenuList = optionMenuList;
    }
}
