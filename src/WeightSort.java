import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Integer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WeightSort {

    public static String orderWeight(String strng) {
        final String regex = "(\\d+)";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(strng);

        List<Integer> list = new ArrayList<Integer>();
        while (matcher.find()) {
            list.add(Integer.parseInt(matcher.group(0)));
            }
        for (int count=0 ; count<list.size(); count++ ) {
            int min = weight(list.get(count));
            int min_i = count;
            for (int c2 = count + 1; c2 < list.size(); c2++) {
                if (weight(list.get(c2)) < min) {
                    min = weight(list.get(c2));
                    min_i = c2;
                }
            }
            if ( count != min_i){
                int tmp = list.get(count);
                list.set(count, list.get(min_i));
                list.set(min_i, tmp);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(i).append(' ');
        }
        sb.delete(sb.length()-1,sb.length());
                 return sb.toString();
    }

    public static int weight(int dig) {
        int num = dig;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}