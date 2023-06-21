package homework13.ex3;

public enum Products { APPLE(40),POTATO(50),MILK(45),BEER(60),TOBACCO(100),NOTHING(0);
    private int cost;

    Products(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
