package priv.kimking.exhaust;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/16
 */
public class GoldRatio {

    public static void main(String... args) {
        System.out.println(getGoldRatio(1E-10));
        System.out.println(getGoldRatioBy(1E-10));
    }

    public static int getGoldRatioBy(double t) {
        int n = 6;
        while (true) {
            if (fbnc(n) * fbnc(n + 2) * t > 1) {
               return n;
            }
            n++;
        }
    }


    public static int getGoldRatio(double t) {
        int n = 6;
        while (true) {
            double r1 = (double) fbnc(n+2) / fbnc(n +1);
            double r2 = (double) fbnc(n + 1) / fbnc(n);
            if (Math.abs((r2 - r1)) < t) {
                return n;
            }
            n++;
        }
    }


    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 54, 85...
    public static int fbnc(int n) {

        if (n == 1) return 0;
        if (n == 2) return 1;
        return fbnc(n - 1) + fbnc(n - 2);
    }
}
