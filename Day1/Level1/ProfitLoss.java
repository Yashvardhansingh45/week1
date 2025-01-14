package Level1;
class ProfitLoss{
	public static void main(String []args){
		// taking cost price and selling price and calculating profit and profit percentage
		int costPrice = 129, sellPrice = 191, profit;
		// calculating profit and profit percentage
		double profitPercentage;
		// calculating profit
			profit = sellPrice - costPrice;
		// calculating profit percentage
			profitPercentage = (double) profit / (double) costPrice * 100;
		// displaying the result
	System.out.println("The Cost Price is INR "+ costPrice +" and Selling Price is INR "+ sellPrice );
	System.out.println("The Profit is INR "+ profit +" and the Profit Percentage is "+ profitPercentage);
	}
}