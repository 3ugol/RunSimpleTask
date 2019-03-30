public class Max {  //  Максимальная сумма диапазона чисел
    public static int sequence(int[] arr) {
        int max=0 ,in=0, out=0;
        for (int i = 0; i < arr.length; i++) {
        int i1=0, j=0;
            for (j+=i; j < arr.length; j++) {
                i1 += arr[j];
                if (i1>max) {
                    max = i1;
                    in = i;
                    out = j;
                }
            }
            System.out.println("ot" + in + "do" + out + " max" + max);
        }
        return max;
    }
}

