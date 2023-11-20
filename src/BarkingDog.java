public class BarkingDog {
    public static boolean shouldWakeUp(boolean barkTrue, int hourOfTheDay){
        return (22 < hourOfTheDay ) && (barkTrue) && (hourOfTheDay < 24) ? true : (0 <= hourOfTheDay) && (barkTrue) && (hourOfTheDay < 8) ? true : false;
    }
}
