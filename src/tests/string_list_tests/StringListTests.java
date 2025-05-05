package tests.string_list_tests;

import java.util.List;

import main.practicas_day1.Referenced.ReferencedMain;
import main.practicas_day1.Streams.StreamsMain;
import main.practicas_day1.Lambda.LambdaMain;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StringListTests {
    static List<String> namesFull = List.of("Ana", "Luis", "Pedro", "María", "Lucía",
            "Klbkch", "Erin", "Numbtongue", "Grimalkin",
            "Xrn", "Hi", "1");
    static List<String> namesShort = List.of("Ana", "Luis", "Pedro", "Maria", "Lucia");
    static List<String> namesShortCapitalized = List.of("ANA", "LUIS", "PEDRO", "MARIA", "LUCIA");

    static List<String> namesTwo = List.of("Pedro", "1", "Hi", "Xrn", "Erin", "Ana");
    static List<String> namesTwoSortedByLengthAscending = List.of("1", "Hi", "Ana", "Xrn", "Erin", "Pedro");

    @Test
    public void sliceListFromLengthTest7() {
        assertEquals(List.of("Numbtongue", "Grimalkin"), StreamsMain.sliceListFromLength(namesFull,7));
    }
    @Test
    public void sliceListFromLengthTest6() {
        assertEquals(List.of("Klbkch", "Numbtongue", "Grimalkin"), StreamsMain.sliceListFromLength(namesFull,6));
    }
    @Test
    public void sliceListFromLengthTestNone() {
        assertEquals(List.of(), StreamsMain.sliceListFromLength(namesFull,321));
    }
    @Test
    public void capitalizeList() {
        assertEquals(namesShortCapitalized, StreamsMain.capitalizeStringsInList(namesShort));
    }

    @Test
    public void sortListByLengthAscending() {
        assertEquals(namesTwoSortedByLengthAscending, LambdaMain.sortListByLengthAscending(namesTwo));
    }

    @Test
    public void sortListIgnoringCase() {
        assertEquals("apricot",
                ReferencedMain.sortWordsIgnoringCase(
                        List.of("Apple", "banana", "apricot", "Blueberry")).get(1));
    }
}
