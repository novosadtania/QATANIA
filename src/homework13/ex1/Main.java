package homework13.ex1;

public class Main {


    public static void main(String[] args) {
        Shop shop = new Shop("Eva");
        Buyer buyer = new Buyer("Ivan", false, 22);
        Goods goods = new Goods("Алкоголь", 333);
        Seller seller = new Seller("Tania", false);
//        shop.returnCost(buyer,seller,shop,goods);
        Shop shop2 = new Shop("ATB");
        Buyer buyer2 = new Buyer("Pavlo", true, 12);
        Goods goods2 = new Goods("Алкоголь", 32);
        Seller seller2 = new Seller("Maria", true);
//        shop.returnCost(buyer2,seller2,shop2,goods2);
        Shop shop3 = new Shop("Silpo");
        Buyer buyer3 = new Buyer("Iryna", true, 29);
        Goods goods3 = new Goods("Pepsi", 40);
        Seller seller3 = new Seller("Misha", true);
        shop.returnCost(buyer3, seller2, shop3, goods3);


    }
}
