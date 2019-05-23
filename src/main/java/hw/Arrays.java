package hw;

import java.util.Random;

public class Arrays {
    protected InputHelper inputHelper = new InputHelper();
    private final Random random = new Random();

    public void setInputHelper(InputHelper inputHelper) {
        this.inputHelper = inputHelper;
    }

   public int oneRandomInt() {
        return random.nextInt();
    }

    public int[] CreateVariable(int... b) {
        // empty
        if (b.length == 0) {
            return random();
            // 1
        } else if (b.length == (b[0] + 1)) {
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
                    a[i] = oneRandomInt(); //random.nextInt(100);
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
        int n = inputHelper.parserLength();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = inputHelper.parser("Введено не число , попробуйте ещё раз \n");
        }
        return array;
    }

    public int[] CreateStandart(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = inputHelper.parser("Введено не число , попробуйте ещё раз \n");
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

    public int[] rndWithLength(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = oneRandomInt();//random.nextInt(100);
        }
        return array;
    }


    public int[] random() {
        System.out.print("Введите количество элементов рандомного заполняемого массива: ");
        int n = inputHelper.parserLength();
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
