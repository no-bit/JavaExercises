public class mistake {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public int addToner(int tonerAmount){
        if (tonerAmount < 0){
            return -1;
        }
        if (tonerAmount + tonerLevel <= 100){
            tonerLevel += tonerAmount;
            return tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        if (duplex){
            if (pages % 2 == 0) {
                pagesPrinted += pages / 2;
            } else {
                pagesPrinted += (pages / 2) + 1;
            }
        } else {
            pagesPrinted += pages;
        }
        return pages;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
    public mistake(int tonerLevel, boolean duplex){
        if (tonerLevel < 0 || tonerLevel > 100){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }
}
//got a small mistake in this code will look on later