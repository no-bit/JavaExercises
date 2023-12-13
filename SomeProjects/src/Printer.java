public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer(44, 66, true);
        System.out.println(printer.printPages(23));
    }
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
        return pagesPrinted;
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
}
