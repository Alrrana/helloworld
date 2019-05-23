package hw;

public class InsertionModified {
    public static void main(String[] args) {
        Arrays arrayHelper = new Arrays();
        Sorts sortHelper = new Sorts();
//        int[] first = arrayHelper.random();
//        int[] first = arrayHelper.CreateStandart();
//

        int[] first ={6, 8, 5, 9, 7, 4, 2, 3, 0, 1};
        System.out.println("Введенный массив: ");

        arrayHelper.print(first);

        sortHelper.InsertionSortModified(first);

        System.out.println("\nОтсортированные массивы(Метод InsertionSortModified): ");
        arrayHelper.print(first);

        try {

        } catch (Exception ex) {

        }

    }
}
