package com.coffeemenuapp.coffee_aromablu_app.service;

import com.coffeemenuapp.coffee_aromablu_app.model.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class MenuService {
    private List<Coffee> coffees;
    private List<Accessory> accessories;

    public MenuService() {
        coffees = new ArrayList<>();
        accessories = new ArrayList<>();

        coffees.add(new Coffee("Espresso", 2.50, "Calories: 5, Protein: 0g, Fat: 0g, Carbs: 1g", "Espresso originated in Italy. It's known for its rich, intense flavor.", "Espresso + Chocolate Cake"));
        coffees.add(new Coffee("Latte", 3.50, "Calories: 150, Protein: 9g, Fat: 6g, Carbs: 13g", "The latte, popular in Europe, is a blend of espresso and steamed milk.", "Latte + Croissant"));
        coffees.add(new Coffee("Cappuccino", 3.00, "Calories: 80, Protein: 4g, Fat: 4g, Carbs: 6g", "Cappuccino has its roots in Italy, known for its balanced flavor.", "Cappuccino + Carrot Cake"));
        coffees.add(new Coffee("Mocha", 4.00, "Calories: 200, Protein: 8g, Fat: 8g, Carbs: 28g", "Mocha combines coffee and chocolate, with origins in Yemen.", "Mocha + Chocolate Cake"));
        coffees.add(new Coffee("Americano", 2.00, "Calories: 10, Protein: 0g, Fat: 0g, Carbs: 2g", "Americano is an espresso diluted with hot water, popular in the USA.", "Americano + Biscotti"));
        coffees.add(new Coffee("White Americano", 3.50, "Calories: 15, Protein: 0g, Fat: 0g, Carbs: 3g", "White Americano is a variation of the classic Americano, made with espresso and hot water, topped with a splash of cream.", "White Americano + Shortbread Cookie"));
        coffees.add(new Coffee("Flat White", 3.75, "Calories: 120, Protein: 6g, Fat: 7g, Carbs: 10g", "Flat White is an Australian coffee, made with espresso and microfoam.", "Flat White + Banana Bread"));
        coffees.add(new Coffee("Caramel Macchiato", 4.25, "Calories: 250, Protein: 9g, Fat: 8g, Carbs: 35g", "Caramel Macchiato is a popular drink with steamed milk, espresso, and caramel.", "Caramel Macchiato + Muffin"));
        coffees.add(new Coffee("Cold Brew", 3.00, "Calories: 5, Protein: 0g, Fat: 0g, Carbs: 1g", "Cold Brew is coffee steeped in cold water for an extended period.", "Cold Brew + Donut"));
        coffees.add(new Coffee("Nitro Cold Brew", 4.00, "Calories: 5, Protein: 0g, Fat: 0g, Carbs: 1g", "Nitro Cold Brew is cold brew coffee infused with nitrogen for a creamy texture.", "Nitro Cold Brew + Almond Croissant"));
        coffees.add(new Coffee("Macchiato", 3.75, "Calories: 180, Protein: 7g, Fat: 5g, Carbs: 22g", "Macchiato is an espresso with a small amount of milk.", "Macchiato + Donut"));
        coffees.add(new Coffee("Affogato", 4.25, "Calories: 220, Protein: 6g, Fat: 10g, Carbs: 25g", "Affogato is espresso poured over a scoop of vanilla ice cream.", "Affogato + Biscotti"));
        coffees.add(new Coffee("Pumpkin Spice Latte", 4.75, "Calories: 380, Protein: 14g, Fat: 14g, Carbs: 52g", "Pumpkin Spice Latte is a fall favorite with espresso, pumpkin, and spices.", "Pumpkin Spice Latte + Pumpkin Scone"));
        coffees.add(new Coffee("White Chocolate Mocha", 4.50, "Calories: 420, Protein: 15g, Fat: 12g, Carbs: 60g", "White Chocolate Mocha is a sweet coffee drink with white chocolate.", "White Chocolate Mocha + Chocolate Chip Cookie"));
        coffees.add(new Coffee("Java Chip Frappuccino", 5.50, "Calories: 460, Protein: 7g, Fat: 22g, Carbs: 61g", "Java Chip Frappuccino is a blended coffee drink with chocolate chips and java chips.", "Java Chip Frappuccino + Double Chocolate Brownie"));
        coffees.add(new Coffee("Caramel Frappuccino", 5.25, "Calories: 420, Protein: 5g, Fat: 18g, Carbs: 65g", "Caramel Frappuccino is a blended coffee drink with caramel syrup.", "Caramel Frappuccino + Caramel Brownie"));
        coffees.add(new Coffee("Mocha Frappuccino", 4.75, "Calories: 320, Protein: 5g, Fat: 13g, Carbs: 49g", "Mocha Frappuccino is a blended coffee drink with chocolate syrup and whipped cream.", "Mocha Frappuccino + Double Chocolate Brownie"));
        coffees.add(new Coffee("White Chocolate Mocha Frappuccino", 5.25, "Calories: 450, Protein: 6g, Fat: 19g, Carbs: 66g", "White Chocolate Mocha Frappuccino is a blended coffee drink with white chocolate mocha sauce and whipped cream.", "White Chocolate Mocha Frappuccino + White Chocolate Macadamia Cookie"));
        coffees.add(new Coffee("Vanilla Bean Frappuccino", 4.50, "Calories: 320, Protein: 4g, Fat: 13g, Carbs: 50g", "Vanilla Bean Frappuccino is a refreshing and sweet Frappuccino made with milk, ice, and vanilla bean powder.", "Vanilla Bean Frappuccino + Sugar Cookie"));

        accessories.add(new Accessory("AromaBlu Mug", 10.0));
        accessories.add(new Accessory("AromaBlu Portable Bluetooth Speaker", 25.0));
        accessories.add(new Accessory("AromaBlu T-Shirt", 20.0));
        accessories.add(new Accessory("AromaBlu Plush Toy", 15.0));
        accessories.add(new Accessory("AromaBlu Phone Case", 18.0));
        accessories.add(new Accessory("AromaBlu Hat", 16.0));
        accessories.add(new Accessory("AromaBlu Keychain", 8.0));
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }
}
