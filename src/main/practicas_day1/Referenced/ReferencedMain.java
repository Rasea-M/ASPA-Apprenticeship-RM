package main.practicas_day1.Referenced;

import java.util.List;

public class ReferencedMain {

    //4.1, I got nothing
    public static void printList(List<?> list) {
        list.forEach(System.out::println);
    }

    //This cannot possibly qualify as a test
    public static void testPrintList() {
        printList(List.of("asd", 1, new Object(), 0x123, 0xb123, List.of(123,"nested")));
    }

    //4.2
    public static List<String> sortWordsIgnoringCase(List<String> words) {
        return words.stream().sorted(String::compareToIgnoreCase).toList();
    }
}
