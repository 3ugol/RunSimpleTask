public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        return 2 + bouncingBall(h * bounce, bounce, window);   //---- Не пойму как -------
    }

/*public static int bouncingBall(double h, double bounce, double window) {
        int result = 1;
        if (h > 0 && (bounce > 0 && bounce < 1) && h>window) {
            for (; h > window; ) {
                h = h * bounce;
                if (h > window) {
                    result += 2;
                }
            }
            return result;
        }
        else return -1;
    } */
}