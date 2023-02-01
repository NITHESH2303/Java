import java.util.*;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        builder.reverse();
        System.out.println(builder.toString());
    }
}
