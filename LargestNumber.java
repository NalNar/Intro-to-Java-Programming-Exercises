// from listing 13.5
import java.util.ArrayList;
import java.math.*;

public class LargestNumber {
    public static void main(String[]args){
        // creating an array list of number objects
        ArrayList <Number> list = new ArrayList<>();

        // adding integer to the arraylist of number
        list.add(45);
        list.add(52.2);

        // adding BigIntegers
        list.add(new BigInteger("3432323234344343101"));
        // adding BigDecimal
        list.add(new BigDecimal("2.0909090989091343433344343"));
        System.out.println("The largest number is: " + getLargestNumber(list));
    }
    
    public static Number getLargestNumber(ArrayList <Number> list){
        if(list == null || list.size()==0)
            return null;

        Number number = list.get(0);
        for (int i = 1; i<list.size(); i++){
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);
        }
        return number;
    }
    
}
