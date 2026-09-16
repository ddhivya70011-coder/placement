class Sum2DArray {
    public static void main(String[] args) {

        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60}
        };

        int sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}