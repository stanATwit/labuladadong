package com.设计模式.单例模式;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCartManager {

    private static final ShoppingCartManager shoppingCar = new ShoppingCartManager();

    private Map<String,Integer> cart = new HashMap<>();

    private ShoppingCartManager(){
    }

    public static ShoppingCartManager getInstance(){
        return shoppingCar;
    }

    // 添加商品到购物车
    public void addToCart(String itemName, int quantity) {
        cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
    }

    // 查看购物车
    public void viewCart() {
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ShoppingCartManager cart = ShoppingCartManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("0")) {
            String itemName = scanner.next();
            int quantity = scanner.nextInt();

            // 获取购物车实例并添加商品
            cart.addToCart(itemName, quantity);
        }

        // 输出购物车内容
        cart.viewCart();
    }
}
