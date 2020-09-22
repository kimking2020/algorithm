package priv.kimking.exhaust;

/**
 * <p>
 *
 * @author kim
 * @date 2020/9/16
 */
public class PrimeNum {

    // 2,3,5,7,11,13...
    public static void main(String... args) {

        System.out.println(getPrimeBySeq(10001));

    }

    private static int getPrimeBySeq(int seq) {
        if (seq == 1) return 2;
        if (seq == 2) return 3;
        int currt = 3;
        int i = 0;
        int j = 2;
        while (j <= seq - 2) {
            i += 6;
            if (isPrime(i -1)) {
                currt = i - 1;
                j++;
            }
            if (isPrime(i + 1)) {
                currt = i + 1;
                j++;
            }
        }
        if (j == seq - 1) {
            while (true) {
                i += 6;
                if (isPrime(i - 1)) {
                    currt = i - 1;
                    break;
                }
                if (isPrime(i + 1)) {
                    currt = i + 1;
                    break;
                }
            }
        }
        return currt;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2 || num == 3) {
            return true;
        } else if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(num); i+=6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
