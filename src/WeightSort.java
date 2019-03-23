import java.util.ArrayList;
import java.util.List;
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
            int min = (list.get(count)%10) + (list.get(count)%100) + (list.get(count)%1000) ; // 11
            int min_i = count;
            for (int c2 = count + 1; c2 < list.size(); c2++) {
                if ((list.get(c2)%10+list.get(c2)%100+list.get(c2)%1000) < min) { //11  (list.get(c2)%10+list.get(c2)/10)
                    min = list.get(c2)%10+list.get(c2)%100+list.get(c2)%1000;
                    min_i = c2;
                }
            }
            if ( count != min_i){
                int tmp = list.get(count);
                list.set(count, list.get(min_i));
                list.set(min_i, tmp);
            }
        }
        return String.format("" + list);
    }
}