public class Recursion {

    static int trib(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        return trib(n - 1) + trib(n - 2) + trib(n - 3);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Tribonacci of " + n + " = " + trib(n));
    }
}