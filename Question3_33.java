import java.util.Scanner;

public class Question3_33{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight and Price for the package 1 ");
        int weight1 = input.nextInt();
        double price1 = input.nextDouble();

        System.out.print("Enter Weight and Price for the package 2 ");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();

        // price per weight (ppw) 
        double ppw1 = price1/weight1;
        double ppw2 = price2/weight2;

        if (ppw1>ppw2) { System.out.print("Package 1 has better price "); } 
        if (ppw1<ppw2) { System.out.print("Package 2 has better price "); } 
        if ((Math.abs(ppw1 - ppw2) < 1e-6)) { System.out.print("Both Has Same Price"); } // using the epsilon method as direct comparison using == might not work for all values 


    }
}
