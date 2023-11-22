public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(666666));
        System.out.println(getDurationString(11111, 6));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0)
            return "invalid value";
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = (seconds % 60);
        return hours + "h " + minutes + "m " + second + "s";
    }
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59))
                return "invalid value";
        int hours = minutes / 60;
        int minute = (minutes % 60);
        return hours + "h " + minute + "m " + seconds + "s";
    }
}
