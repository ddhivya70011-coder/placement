import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a > b && a > c)
            System.out.println(a + " is Largest");
        else if (b > c)
            System.out.println(b + " is Largest");
        else
            System.out.println(c + " is Largest");
    }
}