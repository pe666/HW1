public class FirstDifficultTask {
    public static String printBites (double b) {
        int counter = 0;
        while (b >= 1024) {
            b = b / 1024;
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
        }
        return (String.format("%.1f", b) + dataSize);
    }
}