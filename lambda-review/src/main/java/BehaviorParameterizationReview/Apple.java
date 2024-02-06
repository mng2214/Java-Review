package BehaviorParameterizationReview;

public class Apple {
    private int appleWeight;
    private AppleColor appleColor;

    @Override
    public String toString() {
        return "Inventory{" +
                "appleWeight=" + appleWeight +
                ", appleColor='" + appleColor + '\'' +
                '}';
    }

    public Apple(int appleWeight, AppleColor appleColor) {
        this.appleWeight = appleWeight;
        this.appleColor = appleColor;
    }

    public int getAppleWeight() {
        return appleWeight;
    }

    public void setAppleWeight(int appleWeight) {
        this.appleWeight = appleWeight;
    }

    public AppleColor getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(AppleColor appleColor) {
        this.appleColor = appleColor;
    }
}
