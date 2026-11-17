package Bit_Manipulation.Easy;

public class Prob_832_flipping_an_image {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row: image){
            //reverse this array and invert the bits
            for(int i=0; i<(image[0].length+1)/2; i++){
                //swap 
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        Prob_832_flipping_an_image solution = new Prob_832_flipping_an_image();
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        }; // Example input
        int[][] result = solution.flipAndInvertImage(image);
        
        System.out.println("Flipped and inverted image:");
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
