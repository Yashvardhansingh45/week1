package Level1;
class FeeDiscount{
	public static void main(String []args){
		// calculating the discount amount and final discounted fee
		int fee = 125000, discountPercent = 10, discountAmount;
		// calculating the discount amount
		discountAmount = (fee * discountPercent) / 100 ;
		// displaying the result
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR " + (fee - discountAmount));
	}
}