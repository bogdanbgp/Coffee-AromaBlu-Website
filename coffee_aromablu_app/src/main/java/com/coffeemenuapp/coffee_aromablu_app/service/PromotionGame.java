package com.coffeemenuapp.coffee_aromablu_app.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class PromotionGame {
    private int itemsBought;

    public PromotionGame() {
        itemsBought = 0;
    }

    public void itemBought() {
        itemsBought++;
    }

    public String getPromotionMessage() {
        if (itemsBought >= 5) {
            return "Congratulations! You have earned a free coffee!";
        } else {
            return "Buy " + (5 - itemsBought) + " more items to earn a free coffee!";
        }
    }

    public String bringFriendPromotion() {
        return "Bring a friend and get 10% off on your next purchase!";
    }

    public String displayPromotions() {
        return "Promotions:\n" +
                "1. " + getPromotionMessage() + "\n" +
                "2. " + bringFriendPromotion();
    }
}
