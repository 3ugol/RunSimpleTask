public class Main {

    public static void main(String[] args) {


       // BouncingBall
        System.out.println(BouncingBall(3.0, 0.66, 1.5));
    }

    public static int BouncingBall(double h, double bounce, double window) {
        //h = 3;
        //bounce = 0.66;
        //window = 1.5;
        int result = 1;
            for (; h > window;h = h * bounce) {
                //h = h * bounce;
                if (h > window) {
                    result = result + 2;

                }

                //System.out.println("result");
            }
        return result;
    }

        static void hello() {
            System.out.println("Ok");
        }
}
