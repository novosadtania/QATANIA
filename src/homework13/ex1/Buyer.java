package homework13.ex1;

public class Buyer {
    private String name;
    private boolean discountCard = true;
    private int age;

    public Buyer(String name, boolean discountCard, int age) {
        this.name = name;
        this.discountCard = discountCard;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(boolean discountCard) {
        this.discountCard = discountCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

