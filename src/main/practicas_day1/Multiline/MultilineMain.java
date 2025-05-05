package main.practicas_day1.Multiline;

public class MultilineMain {
    //5.1
    public static void printPoem() {
        System.out.println("""
                lorem ipsum dolor sit amet adipiscing els
                consectetur adipiscing els
                consectetur adipiscing els
                AI broke. Curious, that.
                """);
    }

    //5.2. It's 4.
    public static void countLinesInMultiline() {
        String text = """
                Uno
                Dos
                Tres
                Cuatro
                """;
        System.out.println(text.lines().count());
    }
}
