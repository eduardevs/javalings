package Collection.list;

public class Cat {
    private String name;

    public Cat (String name){
        this.name = name;
    }
    public void meow() {
        String mieaux = this.name + " : "+"miau";
        System.out.println(mieaux);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
