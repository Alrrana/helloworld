package hw;

import java.lang.reflect.Array;

public class Hw {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < Array.getLength(args); i++)
            builder.append(args[i]);
        System.out.println(builder.toString());
        System.out.println("Hello world!" + builder.toString());
    }

}
