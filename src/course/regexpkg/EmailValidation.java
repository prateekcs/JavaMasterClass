package course.regexpkg;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static void main(String args[]) {
        //adding  emails to an array list
        List<String> emails = new ArrayList<String>();
        // valid email addresses
        emails.add("alice@example.com");
        emails.add("alice.bob@example.co.in");
        emails.add("alice1@example.me.org");
        emails.add("alice_bob@example.com");
        emails.add("alice-bob@example.com");
        emails.add("prateek.kumar_cs.aiml20@gla.ac.in");
        //invalid email addresses
        emails.add("@example.com");
        emails.add("alice&example.com");
        emails.add("alice#@example.me.org");

        //initialize the Pattern object
        Pattern pattern = Pattern.compile(regex);

        //searching for occurrences of regex
        for (String value : emails) {
            Matcher matcher = pattern.matcher(value);

            System.out.println("Email " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
        }
    }
}


