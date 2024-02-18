import java.util.Comparator;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class TraderTest {
    public static void main(String[] args) {

        //1- Find all transactions in 2011 and sort by value
        TransactionData.getAll().stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);
        System.out.println("-".repeat(40));

        //2- What are all the unique cities where the traders work?
        TransactionData.getAll().stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
        System.out.println("-".repeat(40));

        //3- Find all traders from Cambridge and sort them by name

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);
        System.out.println("-".repeat(40));

        //4- Return a string of all trader's names sorted alphabetically
        String stringOfNames = TransactionData.getAll().stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1.concat(n2).concat(" "));
        System.out.println(stringOfNames);
        System.out.println("-".repeat(40));

        //5- Are any traders based in Milan?
        boolean milanTraders = TransactionData.getAll().stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println(milanTraders);
        System.out.println("-".repeat(40));

        //6- Print the values of all transactions from the traders living in Cambridge
        TransactionData.getAll().stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        System.out.println("-".repeat(40));

        //7 - What is the highest value of all the transactions
        Optional<Integer> maxValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(maxValue.get());
        System.out.println("-".repeat(40));

        //8-Find the transaction with the smallest value
        System.out.println("******Task-8************");
        Optional<Transaction> smvalue = TransactionData.getAll().stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);

        System.out.println(smvalue.get());

        Optional<Transaction> smallestValue = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));

        System.out.println(smallestValue.get());
    }
}