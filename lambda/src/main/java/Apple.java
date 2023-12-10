import lombok.Getter;
import lombok.Setter;

public class Apple {

    @Getter
    @Setter
    private int weight;
    @Getter
    @Setter
    private Color color;

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
