package hw;

import java.lang.reflect.Array;

public class Hw {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            builder.append("\n" + args[i]);
        }
        System.out.println("Hello world!" + builder.toString());
    }

}
