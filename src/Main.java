public class Main {
    public static void main(String[] args) {
        int[] v = new int[] {32, 14, 59, 13, 8, 78, 54, 3};
        FirstTask.maxMin(v);
        System.out.println("Вывод массива с замененными первым и последним элементами на минимум и максимум соответственно");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        System.out.println("------------------ Задание со звездочкой -------------------");
        double b = 1234567;
        System.out.println(b + " В = " + FirstDifficultTask.printBites(b));
    }
}