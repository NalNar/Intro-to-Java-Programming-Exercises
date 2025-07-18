// listing 12.9
public class ChainedException{
    public static void main (String[]args){
        try{
            method1();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void method1() throws Exception{
        try{
            method2();
        }
        catch(Exception ex){
            throw new Exception("New information from method 1 ", ex);
        }
    }
    public static void method2() throws Exception{
        throw new Exception("New Info from Method2 ");
    }
}