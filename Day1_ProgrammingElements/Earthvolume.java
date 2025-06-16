package Day1_ProgrammingElements;

public class Earthvolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.1416;
        double radiusKmCubed = radiusKm * radiusKm * radiusKm;
        double volumeKm3 = (4.0 / 3.0) * pi * radiusKmCubed;
        double radiusMiles = radiusKm * 0.621371;
        double radiusMilesCubed = radiusMiles * radiusMiles * radiusMiles;
        double volumeMiles3 = (4.0 / 3.0) * pi * radiusMilesCubed;
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +" and cubic miles is " + volumeMiles3);
    }
}
