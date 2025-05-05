package main.practicas.Streams;

import java.util.List;

public class StreamsMain {

    public static List<String> sliceListFromLength(List<String> list, int length) {
        return list.stream().filter(str -> str.length() >= length).toList();
    }

    public static List<String> capitalizeStringsInList(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }

}
