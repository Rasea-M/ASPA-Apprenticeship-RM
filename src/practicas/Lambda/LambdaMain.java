package practicas.Lambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaMain {

    //3.1
    public static List<String> sortListByLengthAscending(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder())).toList();
    }

    //3.2 (write tests)
    public static List<Integer> returnIntegerListMatchingPredicate(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(predicate).toList();
    }

}
