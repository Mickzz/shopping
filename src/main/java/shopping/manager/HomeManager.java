package shopping.manager;

import shopping.model.HomeModel;
import shopping.model.home.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeManager {
    private HomeModel homeModel;

    public HomeManager(){
        super();
        init();
    }
    private void init(){
        List<Menu> menuList =  initMenu();
        HomeModel homeModel = new HomeModel();
        homeModel.setMenuList(menuList);
        this.homeModel = homeModel;
    }

    public HomeModel getHomeModel(){
        return homeModel;
    }

    private List<Menu> initMenu(){
        List<Menu> menuList = new ArrayList<>();
        Menu menu = new Menu();
            menu.setId("m001");
            menu.setName("WOMEN");
        SubMenu subMenu = new SubMenu();
            subMenu.setId("sm001");
            subMenu.setSubMenuList(Arrays.asList("NEW IN","CLOTHING","LINGERIE","#SHEINathome","SHOES",
                    "BAGS&ACCESSORIES","HOME&PETS","E-GIFT CARD","SALE"));
        menu.setSubMenu(subMenu);
        menuList.add(menu);
        Menu menu2 = new Menu();
            menu2.setId("m002");
            menu2.setName("CURVE+PLUS");
        SubMenu subMenu2 = new SubMenu();
            subMenu2.setId("sm002");
            subMenu2.setSubMenuList(Arrays.asList("NEW IN","TRENDS","CLOTHING","DRESSES","TOPS",
                    "BOTTOMS","LINGERIE&LOUNGEWEAR","SWIMWEAR","SALE"));
        menu2.setSubMenu(subMenu2);
        menuList.add(menu2);
        Menu menu3 = new Menu();
            menu3.setId("m003");
            menu3.setName("BEAUTY");
        SubMenu subMenu3 = new SubMenu();
            subMenu3.setId("sm003");
            subMenu3.setSubMenuList(Arrays.asList("MAKE UP","NEW IN","BEAUTY TOOLS","PERSONAL CARE",
                    "EXPLORE"));
            menu3.setSubMenu(subMenu3);
        menuList.add(menu3);
        Menu menu4 = new Menu();
            menu4.setId("m004");
            menu4.setName("MEN");
        SubMenu subMenu4 =new SubMenu();
            subMenu4.setId("sm004");
            subMenu4.setSubMenuList(Arrays.asList("NEW IN","TRENDS","CLOTHING","TOPS","SWIMWEAR",
                    "SHOES & ACCESSORRIES","HOME & PETS","SALE"));
        menu4.setSubMenu(subMenu4);
        menuList.add(menu4);
        Menu menu5 = new Menu();
            menu5.setId("m005");
            menu5.setName("KIDS");
        SubMenu subMenu5 = new SubMenu();
            subMenu5.setId("sm005");
            subMenu5.setSubMenuList(Arrays.asList("NEW IN","TRENDS","TODDLERS","BABY","SHOES",
                    "ACCESSORIES","TOYS","MATCHING OUTFITS","SALE"));
        menu5.setSubMenu(subMenu5);
        menuList.add(menu5);
        return menuList;
    }


}
