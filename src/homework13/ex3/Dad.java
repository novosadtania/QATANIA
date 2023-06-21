package homework13.ex3;

import homework13.ex2.UnderZeroException;

public class Dad {
    private String name;
    private int money;
    private Products product1;
    private int numberOfProduct1;
    private Products product2;
    private int numberOfProduct2;

    public Dad(String name, int money, Products product1, int numberOfProduct1, Products product2, int numberOfProduct2) {
        this.name = name;
        this.money = money;
        this.product1 = product1;
        this.numberOfProduct1 = numberOfProduct1;
        this.product2 = product2;
        this.numberOfProduct2 = numberOfProduct2;
    }

    public Dad(String name, int money, Products product1, int numberOfProduct1) {
        this.name = name;
        this.money = money;
        this.product1 = product1;
        this.numberOfProduct1 = numberOfProduct1;
    }

    public Products getProduct1() {
        return product1;
    }

    public void setProduct1(Products product1) {
        this.product1 = product1;
    }

    public Products getProduct2() {
        return product2;
    }

    public void setProduct2(Products product2) {
        this.product2 = product2;
    }

    public int getNumberOfProduct1() {
        return numberOfProduct1;
    }

    public void setNumberOfProduct1(int numberOfProduct1) {
        this.numberOfProduct1 = numberOfProduct1;
    }

    public int getNumberOfProduct2() {
        return numberOfProduct2;
    }

    public void setNumberOfProduct2(int numberOfProduct2) {
        this.numberOfProduct2 = numberOfProduct2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void positiveExit() {
        System.out.println("Шановний, " + getName() + ".Вартість вашої покупки складає : " + ((product1.getCost() * numberOfProduct1) + (product2.getCost()) * numberOfProduct2) + " грн.\n" +
                "Ви придбали : " + product1 + " у розмірі " + numberOfProduct1 + " одиниць, та " + product2 + " у розмірі " + numberOfProduct2 + " одиниць. \n" +
                "Передбачення для Вас : Не здавайтесь! \n Вдалого дня!");
    }
}
