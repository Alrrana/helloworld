package hw;

public class OuterClass {

    static{
        int n = 0;
        int m = 1;
        try {
            double d = m / n;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
//        throw new Error();
    }

    private int one = 1;
    public int two = 2;
    final int three = 3;
    static int four = 4;

    static class Nested {
        static void first (){
//            one++;
//            two++;
//            three++;
            four++;
        }

        void second(){

//            one++;
//            two++;
//            three++;
            four++;
        }
    }

    class Inner{
//        static void first (){
//            one++;
//            two++;
//            System.out.println(three);
//            four++;
//        }

        void second(){

            one++;
            two++;
            System.out.println(three);
            four++;
        }
    }

}
