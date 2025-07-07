/* Exercise 9.2 */

public class Stock{
    private String symbol;
    private String name;
    double previousClosingPrice;
    double currentPrice;

    // constructor which creates the stock with specified symbol and name
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    // method for percentage change  
    public double getChangePercent(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;
    }

}
