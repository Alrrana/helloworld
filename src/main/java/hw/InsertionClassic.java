package hw;

public class InsertionClassic {
    public static void main(String[] args) {
        Singletone.SORTS.getInstance();
        Arrays arrayHelper = new Arrays();
        Sorts sortHelper = new Sorts();
//        int[] first = arrayHelper.random();
        int[] first = arrayHelper.CreateStandart();
//
        System.out.println("Введенный массив: ");

        arrayHelper.print(first);

        sortHelper.InsertionSortClassic(first);

        System.out.println("\nОтсортированные массивы(Метод InsertionSortClassic): ");
        arrayHelper.print(first);

    }
}
