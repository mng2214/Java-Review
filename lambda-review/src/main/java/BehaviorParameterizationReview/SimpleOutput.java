package BehaviorParameterizationReview;

public class SimpleOutput implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getAppleWeight() + " g";
    }
}
