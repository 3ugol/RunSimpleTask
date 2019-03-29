import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int maxTriSum(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        int number=numbers[0], numberm =0;
        for (int i = 0; i < numbers.length; i++) {
            if (number < numbers[i] ) {
                number = numbers[i];
            }
            if (numberm > numbers[i]){
                numberm = numbers[i];
            }
        }
        int number2 =numberm, number3 =numberm ;
        list.add(number);
        for (int i1 = 0; i1 < numbers.length; i1++) {
            if (number2 < numbers[i1] && numbers[i1] < list.get(0) ) {
                number2 = numbers[i1];
            }
        }
        list.add(number2);
        for (int i2 = 0; i2 < numbers.length; i2++) {
            if (number3 < numbers[i2] && numbers[i2] < list.get(1) ) {
                number3 = numbers[i2];
            }
        }
        list.add(number3);
        System.out.println(list);
        int sum=0;
        for (int integer : list) {
            sum += integer;
        }
        return sum;
    }
}
