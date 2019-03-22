import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WeightSort {

    public static String orderWeight(String strng) {
        final String regex = "(\\d+)";
        //strng = "56 65 74 5t y6 -6 100 99 68 86 180 90";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(strng);

        List<String> list = new ArrayList<String>();
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            list.add(matcher.group(0));
                    }
        System.out.println(list.size());
        for (int c=0; c<list.size(); c++ ){
            if (list.get(c).length()>1){
                int s=0;
                for (int c1=0; c1<list.get(c).length(); c1++){
                    s += (list.get(c).charAt(c1)-48);
                    //s = Integer.parseInt(list.get(c) );


                }
                System.out.println(s);
            }
        }
        return list.get(1);
    }
}