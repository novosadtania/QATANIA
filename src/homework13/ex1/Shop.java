package homework13.ex1;

public class Shop implements InterShop {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void returnCost(Buyer buyer, Seller seller, Shop shop, Goods goods) {
        if ((!buyer.isDiscountCard()) && (!seller.isHonest() || goods.getName().equalsIgnoreCase("Алкоголь"))) {
            System.out.println("Шановний, " + buyer.getName() + ", \n продавець " + seller.getName() + " нашого магазину " + shop.getName() +
                    ",продасть вам " + goods.getName() + ". \n Це алкогольний товар. Продавця не цікавить, що Вам " + buyer.getAge() + ", \n він є не чесним і " +
                    "продає усім алкогольні вироби. Вартість вашої покупки становить " + goods.getCost() + " грн. \n Вдалого дня!");
        } else if ((buyer.isDiscountCard()) && (seller.isHonest() && goods.getName().equalsIgnoreCase("Алкоголь")) && (buyer.getAge() <= 18)) {
            System.out.println("Шановний, " + buyer.getName() + ", \n продавець " + seller.getName() + " нашого магазину " + shop.getName() +
                    ", не продасть вам " + goods.getName() + ". \n Це алкогольний товар. Продавця дотримується законів, а Вам " + buyer.getAge() + " років, \n продовець є чесним і " +
                    " не продає алкогольні вироби неповнолітнім. Вартість вашої покупки становить " + goods.getCost() + " грн." +
                    " \n Оскільки у вас є дисконтна карта, Вам надається знижка 10%.До оплати: " + (goods.getCost() - (goods.getCost() * 0.10)) + " грн . \n Вдалого дня!");
        } else if ((buyer.isDiscountCard() && (!seller.isHonest()) && (goods.getName().equalsIgnoreCase("Алкоголь")) && (buyer.getAge() <= 18))) {
            System.out.println("Шановний, " + buyer.getName() + ", \n продавець " + seller.getName() + " нашого магазину " + shop.getName() +
                    ",продасть вам " + goods.getName() + ". \n Це алкогольний товар. Продавця не цікавить, що Вам " + buyer.getAge() + ", \n він є не чесним і " +
                    "продає усім алкогольні вироби. Вартість вашої покупки становить " + goods.getCost() + " грн." +
                    " \n Оскільки у вас є дисконтна карта, Вам надається знижка 10%.До оплати: " + (goods.getCost() - (goods.getCost() * 0.10)) + " грн . \n Вдалого дня!");
        } else if ((buyer.isDiscountCard() && (seller.isHonest()) && (goods.getName().equalsIgnoreCase("Алкоголь")) && (buyer.getAge() >= 18))) {
            System.out.println("Шановний, " + buyer.getName() + ", \n продавець " + seller.getName() + " нашого магазину " + shop.getName() +
                    ",продасть вам " + goods.getName() + ". \n Це алкогольний товар. Вам " + buyer.getAge() + ", \n продавець дотримується законів і " +
                    "продає усім повнолітнім алкогольні вироби. Вартість вашої покупки становить " + goods.getCost() + " грн." +
                    " \n Оскільки у вас є дисконтна карта, Вам надається знижка 10%.До оплати: " + (goods.getCost() - (goods.getCost() * 0.10)) + " грн . \n Вдалого дня!");
        } else if ((!buyer.isDiscountCard() && (seller.isHonest()) && (goods.getName().equalsIgnoreCase("Алкоголь")) && (buyer.getAge() >= 18))) {
            System.out.println("Шановний, " + buyer.getName() + ", \n продавець " + seller.getName() + " нашого магазину " + shop.getName() +
                    ",продасть вам " + goods.getName() + ". \n Це алкогольний товар. Вам " + buyer.getAge() + ", \n продавець дотримується законів і " +
                    "продає усім повнолітнім алкогольні вироби. Вартість вашої покупки становить " + goods.getCost() +
                    " грн . \n Вдалого дня!");
        } else if (!buyer.isDiscountCard()) {
            System.out.println("Шановний, " + buyer.getName() + ", \n продавець " + seller.getName() + " нашого магазину " + shop.getName() +
                    ",продасть вам " + goods.getName() + ". \n Це не алкогольний товар. Вам " + buyer.getAge() + ", \n але для покупки цього товару це не має значення. " +
                    " Вартість вашої покупки становить " + goods.getCost() +
                    " грн . \n Вдалого дня!");
        } else if (buyer.isDiscountCard()) {
            System.out.println("Шановний, " + buyer.getName() + ", \n продавець " + seller.getName() + " нашого магазину " + shop.getName() +
                    ",продасть вам " + goods.getName() + ". \n Це не алкогольний товар. Вам " + buyer.getAge() + ", \n але для покупки цього товару це не має значення. " +
                    " Вартість вашої покупки становить " + goods.getCost() +
                    " грн . \n Оскільки у вас є дисконтна карта, Вам надається знижка 10%.До оплати: " + (goods.getCost() - (goods.getCost() * 0.10)) + " грн . \n Вдалого дня!");
        }
    }

    @Override
    public void returnCost() {

    }
}
