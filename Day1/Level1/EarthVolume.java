package Level1;
class EarthVolume {
    public static void main(String[] args) {
        // Calculate the volume of the earth in cubic kilometers and cubic miles.
        double radius = 6378, pi = 3.14;
        // Volume of earth in cubic kilometers and cubic miles
        double volumekm = (4/3) * pi * (radius * radius * radius);
        double volumemiles = (4/3) * pi * (radius * radius * radius) * 0.62;
        // Display the volume of earth in cubic kilometers and cubic miles
        System.out.println("The volume of earth in cubic kilometers is " + volumekm + " and cubic miles is " + volumemiles);
    }
}