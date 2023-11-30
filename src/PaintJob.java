public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0){
            return -1;
    }
        double areaLeft = (width * height) - (areaPerBucket * extraBucket);
        double needed = Math.ceil(areaLeft / areaPerBucket);
        return (int) needed;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double areaLeft = (width * height);
        double needed = Math.ceil(areaLeft / areaPerBucket);
        return (int) needed;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double needed = Math.ceil(area / areaPerBucket);
        return (int) needed;
    }
}
