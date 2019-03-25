import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Keypad {
    public static int presses(String phrase) {

        String phrase2 = phrase.toUpperCase();
        final String regex1 = "[ADGJMPTW 1*#]" ;
        final String regex2 = "[BEHKNQUX0]" ;
        final String regex3 = "[CFILORVY]";
        final String regex4 = "[SZ234568]";
        final String regex5 = "[79]";
        int tuch=0;
        Pattern pat1 = Pattern.compile(regex1, Pattern.MULTILINE);
        Pattern pat2 = Pattern.compile(regex2, Pattern.MULTILINE);
        Pattern pat3 = Pattern.compile(regex3, Pattern.MULTILINE);
        Pattern pat4 = Pattern.compile(regex4, Pattern.MULTILINE);
        Pattern pat5 = Pattern.compile(regex5, Pattern.MULTILINE);
        Matcher mach1 = pat1.matcher(phrase2);
        Matcher mach2 = pat2.matcher(phrase2);
        Matcher mach3 = pat3.matcher(phrase2);
        Matcher mach4 = pat4.matcher(phrase2);
        Matcher mach5 = pat5.matcher(phrase2);
        while (mach1.find()) tuch++;
        while (mach2.find()) tuch=tuch+2;
        while (mach3.find()) tuch=tuch+3;
        while (mach4.find()) tuch=tuch+4;
        while (mach5.find()) tuch=tuch+5;
        return tuch;
    }
}

/*

ABC 222 1 2 3
DEF 333 4 5 6
GHI 444
JKL 555
MNO
PQRS
TUV
WXYZ
 0
*/
