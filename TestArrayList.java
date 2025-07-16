/* From listing 11.8 */
import java.util.ArrayList;

public class TestArrayList{
    public static void main(String[]args){
        // create an array list to store cities
        ArrayList<String> citylist = new ArrayList<>(); // creates an arraylist of string 

        // adding cities in the citylist
        citylist.add("New Delhi");
        citylist.add("New York City");
        citylist.add("London");
        citylist.add("Chicago");
        citylist.add("Nairobi");
        citylist.add("Newark");
        citylist.add("Mumbai");
        citylist.add("Boston");
        citylist.add("San Francisco");

        System.out.println("List Size? " + citylist.size());
        System.out.println("Is Newark in the list " + citylist.contains("Newark"));
        System.out.println("The location of Nairobi " + citylist.indexOf("Nairobi"));

        // insert new city on index 3 
        citylist.add(3,"Shangai");
        for (int i = citylist.size()- 1; i >= 0; i--) {
            System.out.print(citylist.get(i) + " ");
            System.out.println();
        } 
        


 
    }
}