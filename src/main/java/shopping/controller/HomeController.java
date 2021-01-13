package shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import shopping.db.MenuEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shopping.repository.MenuRepository;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/")
    public List<MenuEntity> getHome() {
        System.out.println("Hello");
        return  menuRepository.findAll();
    }

}
