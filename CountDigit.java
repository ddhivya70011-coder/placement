public class CountDigit {
    public static void main(String[] args) {

        int n = 1223452;
        int digit = 2;
        int count = 0;

        while (n > 0) {
            if (n % 10 == digit)
                count++;

            n = n / 10;
        }

        System.out.println("Count = " + count);
    }
}