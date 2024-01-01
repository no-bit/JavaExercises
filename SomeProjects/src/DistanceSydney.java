public class DistanceSydney {
    private String townName;
    private int distanceFromSydney;

    public DistanceSydney(String townName, int distanceFromSydney) {
        this.townName = townName;
        this.distanceFromSydney = distanceFromSydney;
    }

    public int getDistanceFromSydney() {
        return distanceFromSydney;
    }

    public String getTownName() {
        return townName;
    }

}
