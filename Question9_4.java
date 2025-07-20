// program to display first 50 random integers between 0 and 100
public class Question9_4 {
    public static void main (String[]args){
        java.util.Random random = new java.util.Random(1000); // seed with 1000. 
        
        // displays the first 50 random integers between 0 and 100 
        for (int i = 0; i < 50; i++){
            System.out.println(random.nextInt(100));
        }

    }
}
