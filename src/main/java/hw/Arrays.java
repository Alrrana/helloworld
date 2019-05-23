package hw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arrays {
    Scanner in = new Scanner(System.in);



    private int parserLength() {
        int n = 0;
        while (n <= 0) {
           n=parser("Введено не число или отрицательное число, попробуйте ещё раз \n");
        }

        return n;
    }

    protected String input(){
        return in.nextLine();
    }


    private int parser(String Message) {
        Pattern pattern = Pattern.compile("^(-|\\+)?[0-9]+?$");
        Matcher matcher;
        int n = 0;
        boolean flag = false;
        String str;
        while (!flag) {
            str = input();//input();
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                n = Integer.valueOf(str);
                flag = true;
            } else {
                System.out.print(Message);//
            }
        }
        return n;
    }

    public int[] CreateVariable(int... b) {
        // empty
        if (b.length == 0) {
            return random();
            // 1
        }  else if (b.length == (b[0] + 1)) {
            int[] a = new int[b[0]];
            for (int i = 1; i < b.length; i++) {
                a[i - 1] = b[i];
            }
            return a;

        } else {
            //4 1 2
            if (b.length - 1 < b[0]) {
                int[] a = new int[b[0]];
                for (int i = 1; i < b.length; i++) {
                    a[i - 1] = b[i];
                }
                for (int i = b.length - 1; i < b[0]; i++) {
                    final Random random = new Random();
                    a[i] = random.nextInt(100);
                }
                return a;
                // 4 1 2 3 4 5 6
            } else {
                int[] a = new int[b[0]];
                for (int i = 0; i < a.length; i++) {
                    a[i] = b[i + 1];
                }
                return a;
            }
        }
    }

    public int[] CreateStandart() {
        System.out.print("Введите количество элементов массива: ");
        int n = parserLength();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = parser("Введено не число , попробуйте ещё раз \n");
        }
        return array;
    }

    public int[] CreateStandart(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = in.nextInt();
        }
        return array;
    }

    public ArrayList<Integer> CreateArList(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < n; i++) {

            array.add(in.nextInt());
        }
        return array;
    }

//    public int[] random(int n) {
//        int[] array = new int[n];
//        final Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            array[i] = random.nextInt(100);
//        }
//        return array;
//    }

    public static int[] rndWithLength(int n){
        final Random random = new Random();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }


    public int[] random() {
        System.out.print("Введите количество элементов рандомного заполняемого массива: ");
        int n = parserLength();

//            if(in.hasNext("^\\s?[0-9]+\\\n?$")){
//                n=in.nextInt();
//            } else{
//                System.out.print("Введено не число, попробуйте ещё раз \n");
//                String str = in.nextLine();
//            }
//            if (!in.hasNextInt()) {
//                System.out.print("Введено не число, попробуйте ещё раз\n ");
//                String str = in.nextLine();
//            } else {
//                n = in.nextInt();
//                if (n < 1) {
//                    System.out.print("Введенное число меньше 1 и не может быть длинной массива, попробуйте ещё раз\n ");
//                    n = 0;
//                }
//            }


//            if (in.hasNextInt()) {
//                if(in.nextInt()>1){
//                    n = in.nextInt();
//                }
//            } else {
//                System.out.print("Неверный ввод, попробуйте ещё раз\n ");
//                String str = in.nextLine();
//            }


               return rndWithLength(n);
    }


    public void print(int[] a) {
        System.out.println("Вывод массива: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public int[] copy(int[] a) {
        int[] array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
        return array;
    }
}
