public class stringmethod {
    public static void main(String[] args) {
        String name = "Nithin";

        // 01.lenght
        int len=name.length();
        System.out.println("01. "+len);

        // 02.toLowerCase
        String name2="Nithin T M";
        String lstring=name2.toLowerCase();
        System.out.println("02. "+lstring);

        // 03.toUpperCase
        String name3="Nithin T M";
        String lstring1=name2.toUpperCase();
        System.out.println("03. "+lstring1);

        // 04.trim
        String nontrimmed = "     nothing     ";
        System.out.println("04 " + nontrimmed);
        String trimmed = nontrimmed.trim();
        System.out.println("04.1 " + trimmed);

        //05.substring

        System.out.println("05 " + name.substring(2)); // form 2nd index to ending
        System.out.println("05.1 "+ name.substring(2, 6)); /*from 2nd index to 
                                                            (6-1) which is 5*/
        
        //06.replace

        String name4 = "Harry";
        System.out.println("06 "+name4.replace("r", "p"));
        System.out.println("06.1 "+name4.replace("R", "p")); // it wont replace bcz R is
                                                            // Capital and R it is not there
        //07. indexof
        String myString= "this string contains  double    and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));


    }
    
}
