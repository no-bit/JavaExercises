public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        for (int i = 0; i <= bigCount; i++){
            for (int x = 0; x <= smallCount; x++){
                if (5 * i + x == goal)
                    return true;
            }
        }return false;
    }
}
