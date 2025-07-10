public class Question9_3 {
    public static void main(String[]args){
        java.util.Date date = new java.util.Date();
        long [] time = new long [] {10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L};

        for (int i = 0; i < time.length; i++){
            date.setTime(time[i]);
            System.out.println(date.toString());
        }




    }
    
}
