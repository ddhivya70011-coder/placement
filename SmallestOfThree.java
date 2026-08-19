import java.util.Scanner;

class SmallestOfThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a < b && a < c)
            System.out.println(a + " is Smallest");
        else if (b < c)
            System.out.println(b + " is Smallest");
        else
            System.out.println(c + " is Smallest");
    }
}