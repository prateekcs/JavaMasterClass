package course.regexpkg;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexSample {
    public static void main(String[] args) {
        String re = "\\W\\w"; // \\w is character time then only give true
        // \\W to match symbols
        // \\s for while space
        // \\S non white space character
        // \\d any digit [0-9]
        // \\ non digits
        //String re = "...";// . is character time then only give true
        String text = "%r";
        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);

    }
}
