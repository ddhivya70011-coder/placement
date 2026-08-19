import java.util.Scanner;

class LargestOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b)
            System.out.println(a + " is Largest");
        else
            System.out.println(b + " is Largest");
    }
}