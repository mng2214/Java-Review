package BehaviorParameterizationReview;

public class FancyOutput implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String weight = (apple.getAppleWeight() < 150) ? "Light" : "Heavy";
        return "A " + weight + " " + apple.getAppleColor() + " apple";
    }
}
