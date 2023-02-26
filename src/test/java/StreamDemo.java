
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        streamMapOperation(Arrays.asList(2, 3, 4, 6));
        streamFilterOperation(Arrays.asList(1, 23, 58, 5, 50));
        streamSortedOperation(Arrays.asList(34, 23, 27, 56));
        terminalOperationsOfStream(Arrays.asList(3, 2, 4, 8, 5, 9));
        concatOfStream(Stream.of("hello"), Stream.of("Ram"), Stream.of(25));
        dateAndTimeJava();
    }

    //Intermediate Operation of Java Streams:-[map()/filter()/sorted()]
    public static void streamMapOperation(List<Integer> inputList) {
        List<Integer> squareList = inputList.stream().map(p -> p * p).collect(Collectors.toList());
        System.out.println(squareList);
    }

    public static void streamFilterOperation(List<Integer> inputList) {
        List<Integer> filterList = inputList.stream().filter(s -> s.toString().startsWith("5")).collect(Collectors.toList());
        System.out.println(filterList);
    }

    public static void streamSortedOperation(List<Integer> inputList) {
        List<Integer> sortedList = inputList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

    }

    //Terminal Operation of Java Stream:-
    public static void terminalOperationsOfStream(List<Integer> inputList) {
        List<Integer> collectSquare = inputList.stream().map(p -> p * p).collect(Collectors.toList());
        System.out.println(collectSquare);
        inputList.stream().map(p -> p * p).forEach(y -> System.out.print(y + " "));
        Integer evenNumber = inputList.stream().filter(p -> p % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(evenNumber);

    }

    //Stream Concat:-
    public static void concatOfStream(Stream<String> stream1, Stream<String> stream2, Stream<Integer> stream3) {
        Stream<String> concat1 = Stream.concat(stream1, stream2);
        Stream.concat(concat1, stream3).forEach(p -> System.out.print(p + " "));
    }

    //Date and time:-
    public static void dateAndTimeJava() {
        Date date = new Date();
        System.out.println("Date is =>  " + date);
    }
}
