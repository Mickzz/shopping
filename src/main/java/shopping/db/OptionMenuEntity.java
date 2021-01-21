package shopping.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Entity(name = "optionmenu")
public class OptionMenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String optionmenuList;

    public OptionMenuEntity(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOptionmenuList() {
        return optionmenuList;
    }

    public void setOptionmenuList(String optionmenuList) {
        this.optionmenuList = optionmenuList;
    }
}
