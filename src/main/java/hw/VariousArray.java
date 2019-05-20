package hw;

class One implements Four{
    @Override
    public void doSomething() {
        System.out.println("Method doSomething is working...");
    }
};

class Two extends One implements Three {
    @Override
    public void doSomething() {
        System.out.println("Another doSomething method is working...");
    }
};

interface Three {
};
interface Four{
    void doSomething();
}

public class VariousArray {
    private static Four four;
    public static void main(String[] args) {
        Arrays arrayHelper = new Arrays();

        OuterClass outerClass = new OuterClass();

        OuterClass.Nested nested = new OuterClass.Nested();
        OuterClass.Inner inner = (new OuterClass()).new Inner();
        inner.second();


        String a = "A";
        String b = a+"";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        One A = new One();
        Two B = new Two();
        System.out.println("A instanceof One: " +
                (A instanceof One));
        System.out.println("A instanceof Two: " +
                (A instanceof Two));
        System.out.println("A instanceof Three: " +
                (A instanceof Three));
        System.out.println("B instanceof One: " +
                (B instanceof One));
        System.out.println("B instanceof Two: " +
                (B instanceof Two));
        System.out.println("B instanceof Three: " +
                (B instanceof Three));
        four.doSomething();

//        int[] first = arrayHelper.CreateVariable(); // 1 2 rnd rnd
//        arrayHelper.print(first);
       int [] first = arrayHelper.CreateVariable(1);// 1
        arrayHelper.print(first);
        first = arrayHelper.CreateVariable(5);// rnd rnd rnd rnd rnd
        arrayHelper.print(first);
        first = arrayHelper.CreateVariable(1, 2, 3);// 2
        arrayHelper.print(first);
        first = arrayHelper.CreateVariable(4, 1, 3);// 1 3
        arrayHelper.print(first);
        first = arrayHelper.CreateVariable(5, 1, 3, 4);// 1 3
        arrayHelper.print(first);
//        throw new Error();

    }


}
