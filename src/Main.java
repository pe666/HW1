public class Main {
    public static void main(String[] args) throws MassiveIsEmptyException {
        int[] v = new int[] {};
        FirstTask.maxMin(v);
        System.out.println("Вывод массива с замененными первым и последним элементами на минимум и максимум соответственно");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        System.out.println("------------------ Задание со звездочкой -------------------");
        long b = Long.MAX_VALUE;
        System.out.println(b + " В = " + FirstDifficultTask.printBites(b));
    }
}