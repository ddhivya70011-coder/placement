class Smallest2DArray {
    public static void main(String[] args) {

        // Create a 2D array
        int[][] arr = {
            {10, 50, 30},
            {40, 90, 60}
        };

        // Assume first element is smallest
        int smallest = arr[0][0];

        // Loop through rows
        for (int i = 0; i < 2; i++) {

            // Loop through columns
            for (int j = 0; j < 3; j++) {

                // Check for smaller element
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }

        // Display the smallest element
        System.out.println("Smallest = " + smallest);
    }
}