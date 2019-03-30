import java.util.ArrayList; // последовательно апает буквы в слове
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        List <String> list = new ArrayList<String>();
        for (int i=0; i<str.length();i++){
//            int w=1;
            if (Character.isLetter(str.charAt(i))){
//                list.add(str.replace(str.charAt(i), Character.toUpperCase(str.charAt(i))));
//                list.add(str.substring(i, w+=i).toUpperCase() + str.substring(w));

                StringBuilder sb = new StringBuilder(str.toLowerCase());
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                String capitalized = sb.toString();
                list.add(capitalized);
            }
           System.out.println(list);
        }
//        return new String[] {};
        return list.toArray(new String[0]);
    }
}
