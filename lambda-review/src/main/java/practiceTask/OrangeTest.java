package practiceTask;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, Color.GREEN)); //data
        inventory.add(Orange.builder().weight(250).color(Color.RED).build()); //builder
        inventory.add(Orange.builder().weight(50).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(175).color(Color.RED).build());
        inventory.add(Orange.builder().weight(225).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).build()); //builder skipped color

        OrangeFormatter simpleFormat = orange -> "An orange of " + orange.getWeight() + " g.";
        prettyPrintOrange(inventory, simpleFormat);
        System.out.println("***********************");

        // providing action directly
        prettyPrintOrange(inventory, orange -> "An orange of " + orange.getWeight() + " g.");
        System.out.println("***********************");

        prettyPrintOrange(inventory, orange -> {
            String characteristics = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristics + " " + orange.getColor() + " orange";
        });
        System.out.println("***********************");

    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter) {
        for (Orange orange : inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }


}
