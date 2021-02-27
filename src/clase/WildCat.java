package clase;

public class WildCat extends Animal {
public String food;

    public WildCat(String nume) {
        super(nume);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public WildCat(String nume, String food) {
        super(nume);
        this.food = food;
    }
}
