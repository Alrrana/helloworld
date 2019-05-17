package hw;

public class Quick {
    public static void main(String[] args) {
        Arrays arrayHelper = new Arrays();
        Sorts sortHelper = new Sorts();
//        int[] first = arrayHelper.random();
        int[] first = arrayHelper.CreateStandart();
//
        System.out.println("Введенный массив: ");

        arrayHelper.print(first);

        sortHelper.QuickSort(first);

        System.out.println("\nОтсортированные массивы(Метод QuickSort): ");
        arrayHelper.print(first);

    }

}
