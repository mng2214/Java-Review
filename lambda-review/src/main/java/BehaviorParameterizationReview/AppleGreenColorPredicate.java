package BehaviorParameterizationReview;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getAppleColor().equals(AppleColor.GREEN);
    }
}
