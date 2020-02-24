public class FirstTask {
    public static void maxMin(int[] v) {
        int minValue = v[0];
        int minIndex = 0;
        int maxValue = v[0];
        int maxIndex = 0;
        for (int i = 1; i < v.length; i++) {
            if (minValue > v[i]) {
                minValue = v[i];
                minIndex = i;
            } else if (maxValue < v[i]) {
                maxValue = v[i];
                maxIndex = i;
            }
        }
        v[minIndex] = v[0];
        v[0] = minValue;
        v[maxIndex] = v[v.length-1];
        v[v.length-1] = maxValue;

    }
}