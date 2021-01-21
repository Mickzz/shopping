package shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shopping.db.*;
import shopping.repository.*;


import java.util.Collections;
import java.util.List;

import static java.awt.SystemColor.menu;

@RestController
public class HomeController {

//    @Autowired
//    private MenuRepository menuRepository;
    @Autowired
    private OptionMenuRepository optionMenuRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SubMenuRepository subMenuRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MenuSubRepository menuSubRepository;

    @GetMapping("/optionmenu")
    public List<OptionMenuEntity> getOptionMenu() {
        System.out.println("Hello");
        return  optionMenuRepository.findAll();
    }
    @GetMapping("/optionmenu-optionmenuList/{optionmenu}")
    public OptionMenuEntity getMenuByoptionmenuList(
            @PathVariable("optionmenu") String optionmenu,
            @RequestParam("optionmenuOptionmenuList") String optionmenuList
    ) {
        return  optionMenuRepository.findByoptionmenuList(optionmenuList);
    }

//    @GetMapping("/menu")
//    public List<MenuEntity> getMenu(){
//        return  menuRepository.findAll();
//    }
//
//    @GetMapping("/menu-name/{menu}")
//    public MenuEntity getMenuById(
//            @PathVariable ("menu") String menu,
//            @RequestParam("menuName") String name,
//            @RequestParam("menu2") String menu2
//    ) {
//        System.out.println("?menuName "+name);
//        System.out.println("menu "+menu);
//        return menuRepository.findByName(name);
//    }
    @GetMapping("/payment")
    public List<PaymentEntity> getPayment(){
        return paymentRepository.findAll();
    }

    @GetMapping("/payment-username/{payment}")
    public PaymentEntity getPaymentByUsername(
            @PathVariable ("payment") String payment,
            @RequestParam ("paymentUsername") String username
    ){
        return paymentRepository.findByusername(username);
    }

    @GetMapping("/product")
    public List<ProductEntity> getProduct(){
        return productRepository.findAll();
    }
    @GetMapping("/product-productName/{product}")
    public ProductEntity getProductByProductName(
            @PathVariable("product") String product,
            @RequestParam("productName") String productName
    ){
        return productRepository.findByproductName(productName);
    }

    @GetMapping("/submenu")
    public List<SubMenuEntity> getSubMenu(){
        return  subMenuRepository.findAll();
    }
    @GetMapping("/submenu-submenuList/{submenu}")
    public SubMenuEntity getSubmenuBySubmenuList(
            @PathVariable("submenu") String submenu,
            @RequestParam("submenuSubmenuList") String submenuList
    ){
        return  subMenuRepository.findBySubmenuList(submenuList);
    }
    @GetMapping("/user")
    public List<UserEntity> getUser(){
        return userRepository.findAll();
    }
    @GetMapping("/user-firstname/{user}")
    public UserEntity getUserByFirstname(
            @PathVariable("user") String user,
            @RequestParam("userFirstname") String firstname
    ){
        return userRepository.findByfirstname(firstname);
    }
    @GetMapping("/")
    public List<MenuSubEntity> getMenuSub(){
        return menuSubRepository.findAll();
    }

}
