public class test{
    public static void main(String[]args){
        // randomize 2d array
        int [][] matrix = new int[10][10];

        for (int row = 0; row < matrix.length; row++ )

            for (int column = 0; column < matrix[row].length; column++)

                matrix[row][column] = (int) (Math.random()*10);
        
        java.util.Arrays.sort(matrix);
        
        for (int[] row : matrix){
            for (int column : row) {
                System.out.print(column);
                } 
            }
    }
}