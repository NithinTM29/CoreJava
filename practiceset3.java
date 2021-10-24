public class practiceset3 {
    public static void main(String[] args) {

        // 01.lower the string
        String name = "Nithin";
        System.out.println("01." + name.toLowerCase());

        // 02.replace
        String name2 = "  Nithinarya  ";
        // this will copy the name and change the things bcz Strings are immutable
        System.out.println("02." + name2.replace(" ", "_"));
        // look this is immuted
        System.out.println(name2);

        // 03.letter template

        // 1st method
        String letter = "Harry";
        System.out.println("Dear " + letter + ", Thanks a Lot");

        // 2nd method
        String given = "Dear <|name|>, Thanks a lot";
        System.out.println(given.replace("<|name|>", letter));
        // System.out.println(letter);

        // 04. Detect double and triple Spaces
        String myString = "this string contains  double    and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // 05.letter formate

        String letter2 = "Dear harry,\n\tthis java course is nice.\n\tThanks";
        System.out.println(letter2);

        int n = 2;
        while (n > 3) {

        }

    }

}
