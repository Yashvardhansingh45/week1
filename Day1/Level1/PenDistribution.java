package Level1;
class PenDistribution{
	public static void main(String []args){
		// taking number of pens and number of students and calculating the number of pens each student will get and the remaining pens
		int pens = 14, students = 3, remainingPen, PenPerStudent;
		// calculating the number of pens each student will get and the remaining pens
		remainingPen = pens % students ;
		// calculating the number of pens each student will get
		PenPerStudent = pens / students ;
		// displaying the result
			System.out.println("The Pen Per Student is "+PenPerStudent+" and the remaining pen not distributed is "+remainingPen );
	}
}