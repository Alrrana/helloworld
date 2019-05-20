package hw;

public class InsertionModified {
    public static void main(String[] args) {
        Arrays arrayHelper = new Arrays();
        Sorts sortHelper = new Sorts();
//        int[] first = arrayHelper.random();
        int[] first = arrayHelper.CreateStandart();
//
        System.out.println("Введенный массив: ");

        arrayHelper.print(first);

        sortHelper.InsertionSortModified(first);

        System.out.println("\nОтсортированные массивы(Метод InsertionSortModified): ");
        arrayHelper.print(first);

        try{

        }catch(Exception ex){

        }

    }
}
