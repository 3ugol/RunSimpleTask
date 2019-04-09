import java.util.ArrayList;
import java.util.List;

class GapInPrimes {

    public static long [] gap(int g, long m, long n) {
    boolean b=true;
    List <Long> list = new ArrayList<>();
//    List <Long> list2 = new ArrayList<>();
        long [] list2 = new long[2];

        for (long i = m; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {list.add(i);
                System.out.println(list);
            }
            else b = true;
            int x = 0, y = 1;
            for (int q = 1; list.size() > 2 && q < list.size(); q++) {
                if (g == list.get(y) - list.get(x)) {
                    list2[0] = (list.get(x));
                    list2[1] = (list.get(y));
                    return list2;
                }
                x++;
                y++;
            }
        }
        System.out.println(list2[0] +" "+ list2[1]);
        if (list2[0]==0) return null;
        else return list2;
    }
}