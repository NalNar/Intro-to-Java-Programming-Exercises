public class TestStock{
    public static void main(String[]args){
        Stock stock = new Stock("op","reddit");
        stock.currentPrice = 10;
        stock.previousClosingPrice = 100;
        System.out.println(stock.getChangePercent());

    }
}