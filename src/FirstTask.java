public class FirstTask {
    public static void maxMin(int[] v) throws MassiveIsEmptyException {
        boolean isEmpty = v.length < 1;
        if (!isEmpty) {
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
            v[maxIndex] = v[v.length - 1];
            v[0] = minValue;
            v[v.length - 1] = maxValue;
        } else {
            throw new MassiveIsEmptyException("Massive can't be empty");
        }

    }
}