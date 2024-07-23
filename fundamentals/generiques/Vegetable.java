package generiques;

public class Vegetable {
    private String name;

    public String getName() {
        return this.name;
    }

    private Color color;
    public Color getColor() {
        return this.color;
    }

    public Vegetable(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.name + "de couleur : " + this.getColor();
    }

}
