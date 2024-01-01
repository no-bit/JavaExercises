import java.util.LinkedList;

public class DistanceSydneyMain {
    public static void main(String[] args) {
        DistanceSydney sydney = new DistanceSydney("Sydney", 0);
        DistanceSydney adelaide = new DistanceSydney("Adelaide", 1374);
        DistanceSydney aliceSprings = new DistanceSydney("Alice Springs", 2771);
        DistanceSydney brisbane = new DistanceSydney("Brisbane", 917);
        DistanceSydney darwin = new DistanceSydney("Darwin", 3972);
        DistanceSydney melbourne = new DistanceSydney("Melbourne", 877);
        DistanceSydney perth = new DistanceSydney("Perth", 3923);

        LinkedList<DistanceSydney> townAndDistanceList = new LinkedList<>();

        townAndDistanceList.add(sydney);
        townAndDistanceList.add(melbourne);
        townAndDistanceList.add(brisbane);
        townAndDistanceList.add(adelaide);
        townAndDistanceList.add(aliceSprings);
        townAndDistanceList.add(perth);
        townAndDistanceList.add(darwin);

        DistanceSydneyScanner scanner = new DistanceSydneyScanner();
        scanner.forwardBacwardsListMenuQuit(townAndDistanceList);

    }
}
