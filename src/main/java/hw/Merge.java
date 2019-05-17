package hw;

public class Merge {

    public static void main(String[] args) {
        Arrays arrayHelper = new Arrays();
        Sorts sortHelper = new Sorts();
//        int[] first = arrayHelper.random();
        int[] first = arrayHelper.CreateStandart();
//
        System.out.println("Введенный массив: ");

        arrayHelper.print(first);

        sortHelper.Merge(first);

        System.out.println("\nОтсортированные массивы(Метод MergeSort): ");
        arrayHelper.print(first);

    }

}
