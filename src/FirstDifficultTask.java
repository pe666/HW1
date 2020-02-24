public class FirstDifficultTask {
    public static String printBites (long b) {
        int counter = 0;
        double bd = (double) b;
        while (bd >= 1024) {
            bd = bd / 1024;
            counter++;
        }
        String dataSize = "";
        switch (counter) {
            case 0:
                dataSize = " B";
                break;
            case 1:
                dataSize = " KB";
                break;
            case 2:
                dataSize = " MB";
                break;
            case 3:
                dataSize = " GB";
                break;
            case 4:
                dataSize = " TB";
                break;
            case 5:
                dataSize = " PB";
                break;
            case 6:
                dataSize = " EB";
                break;
        }
        return (String.format("%.1f", bd) + dataSize);
    }
}