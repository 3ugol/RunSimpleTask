class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int i=0;
        for ( ;p0<p; i++ ) {
            p0 += (p0 * (percent / 100)) + aug;
        }
        return i;
    }
}