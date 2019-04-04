public class FindMissingLetter {
    public static char findMissingLetter(char[] array) {
//        char [] array ={ 'a','b','c','d','f' };
        char let ='a';
        for (int c=1; c < array.length; c++) {
            int cint =array[c] - 1;
//            char mis = array[c-1]+1);
            if (cint == array[c-1]){
//                System.out.println("ok");
            }
            else {
//                cint=cint+1;

                let =(char) cint;
//                System.out.println(cint +" >" + let);
            }
        }
//                System.out.println(let);
        return let;
    }
}
