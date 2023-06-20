package homework13.ex1;

public class Seller {
    private String name;
    private boolean honest = true;

    public Seller(String name, boolean honest) {
        this.name = name;
        this.honest = honest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHonest() {
        return honest;
    }

    public void setHonest(boolean honest) {
        this.honest = honest;
    }
}
