package com.coffeemenuapp.coffee_aromablu_app.controller;

import com.coffeemenuapp.coffee_aromablu_app.model.Accessory;
import com.coffeemenuapp.coffee_aromablu_app.model.Coffee;
import com.coffeemenuapp.coffee_aromablu_app.model.Order;
import com.coffeemenuapp.coffee_aromablu_app.service.MenuService;
import com.coffeemenuapp.coffee_aromablu_app.service.OrderService;
import com.coffeemenuapp.coffee_aromablu_app.service.PromotionGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private PromotionGame promotionGame;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Welcome to Coffee AromaBlu");
        return "index";
    }

    @GetMapping("/coffees")
    public String coffeeMenu(Model model) {
        List<Coffee> coffees = menuService.getCoffees();
        model.addAttribute("coffees", coffees);
        return "coffee_menu";
    }

    @GetMapping("/accessories")
    public String accessoriesMenu(Model model) {
        List<Accessory> accessories = menuService.getAccessories();
        model.addAttribute("accessories", accessories);
        return "accessories_menu";
    }

    @PostMapping("/orderConfirmation")
    public String placeOrder(Model model, Order order) {
        orderService.placeOrder(order);
        model.addAttribute("order", order);
        return "orderConfirmation";
    }

    @GetMapping("/order")
    public String showOrderForm(Model model) {
        List<Coffee> coffees = menuService.getCoffees();
        List<Accessory> accessories = menuService.getAccessories();
        model.addAttribute("coffees", coffees);
        model.addAttribute("accessories", accessories);
        model.addAttribute("order", new Order("", "", 0.0, ""));
        return "showOrderForm";
    }

    @GetMapping("/allItems")
    public String showAllItems(Model model) {
        List<Coffee> coffees = menuService.getCoffees();
        List<Accessory> accessories = menuService.getAccessories();
        model.addAttribute("coffees", coffees);
        model.addAttribute("accessories", accessories);
        return "allItems";
    }

    @GetMapping("/promotions")
    public String promotionsMenu(Model model) {
        String promotionMessage = promotionGame.getPromotionMessage();
        String bringFriendPromotion = promotionGame.bringFriendPromotion();
        model.addAttribute("promotionMessage", promotionMessage);
        model.addAttribute("bringFriendPromotion", bringFriendPromotion);
        return "promotions_menu";
    }

    @GetMapping("/exit")
    public String exitMenu() {
        return "exit_menu";
    }
}
