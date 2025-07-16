// from the listing 11.9

public class DistinctNumbers {
    public static void main(String[]args){
        // finding from array of list, distinct integers
        // arraylist of integers
        java.util.ArrayList <Integer> distinctInt = new java.util.ArrayList<>();
        
        // scanner for user input 
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int value;
        
        // do while loop for insertion of the integers to arraylist
        do {
            System.out.print("Enter integers (End with 0): ");
            value = scan.nextInt();
            if (!distinctInt.contains(value) && value!=0){
                distinctInt.add(value);
            }
        } 
        while (value != 0);
        
        // sort the integers
        java.util.Collections.sort(distinctInt);{}

        
        // output the integers
        for (int i = 0; i<distinctInt.size(); i++){
            System.out.println(distinctInt.get(i) + " ");
        }

    }
}
