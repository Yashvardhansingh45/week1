package Level1;
class AverageMarks {
    public static void main(String[] args) {
        // Sam scored 94, 95, 96 in maths, physics, and chemistry respectively. Calculate Sam's average mark in PCM.
        int maths = 94,physics = 95,chemistry = 96, average;
        // Sam's average mark in PCM
        average = (maths + physics + chemistry) / 3;
        // Display Sam's average mark in PCM
        System.out.println("Sam's average mark in PCM is " + average);
    }    
}
