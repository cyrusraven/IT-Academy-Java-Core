import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String text = "colors 0xAABBCC, 0xFF00FF and #000100";

        Pattern pattern = Pattern.compile("\\b(#|0x|0X)\\w+\\b" );
        Matcher matcher = pattern.matcher(text);
        Pattern pattern1 = Pattern.compile("#\\d+");
        Matcher matcher1 = pattern1.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start() + 2, matcher.end()));
        }
        while (matcher1.find()) {
            System.out.println(text.substring(matcher1.start() + 1, matcher1.end()));
        }
    }
}
