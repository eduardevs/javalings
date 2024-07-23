package generiques;

public class Fruit {
    private String name;

    public String getName() {
        return this.name;
    }

    private int qty;
    public int getQty() {
        return this.qty;
    }

    public Fruit(String name) {
        this.name = name;
        this.qty = 1;
    }

    // , int qty

    public Fruit(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return this.name + "de quanaité : " + this.getQty();
    }
}
