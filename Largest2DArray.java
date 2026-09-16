class Largest2DArray {
    public static void main(String[] args) {

        
        int[][] arr = {
            {10, 50, 30},
            {40, 90, 60}
        };

        
        int largest = arr[0][0];

        
        for (int i = 0; i < 2; i++) {

            
            for (int j = 0; j < 3; j++) {

                
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }

    
        System.out.println("Largest = " + largest);
    }
}