public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        return (kilometersPerHour >= 0) ? Math.round(kilometersPerHour/1.609) : -1 ;
        }
    public static void printConversion(double kilometersPerHour){
        System.out.println((kilometersPerHour >= 0) ? kilometersPerHour + " km/h = " + Math.round(kilometersPerHour/1.609) + " mi/h" : "Invalid Value");
    }
}

