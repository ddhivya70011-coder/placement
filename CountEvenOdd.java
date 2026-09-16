class CountEvenOdd {
    public static void main(String[] args) {

        
        int[][] arr = {
            {10, 25, 30},
            {45, 60, 75}
        };

        
        int even = 0;
        int odd = 0;

        
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    
                    odd++;
                }
            }
        }

    
        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
    }
}