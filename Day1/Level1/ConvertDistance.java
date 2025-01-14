package Level1;
class ConvertDistance{
	public static void main(String []arr){
		// taking distance in km and converting it into miles
		double km = 10.8 , mile = 1.6;
		// converting km into miles
			mile = km * mile;
		// displaying the result
		System.out.println("The distance "+ km + " km in miles is " + mile);
	}
}