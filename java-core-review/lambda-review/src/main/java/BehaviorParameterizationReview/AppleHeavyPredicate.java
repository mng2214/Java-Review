package BehaviorParameterizationReview;

public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getAppleWeight()>=150;
    }
}
