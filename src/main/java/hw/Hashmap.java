package hw;


import java.util.HashMap;
import java.util.Map;

class KeyObj {
    private int a;
    private boolean b;

    public int hashCode(){
        int answ = (b) ?  a*5: a*5+1;
        return answ;
    }

    KeyObj(int a, boolean b) {
        this.a = a;
        this.b = b;
    }

    int getA(){
        return this.a;
    }

    void setA(int a){
        this.a=a;
    }


    boolean getB(){
        return this.b;
    }

    void setB(boolean b){
        this.b=b;
    }
}


public class Hashmap {
    public static void main(String[] args) {
        HashMap<KeyObj, String> hashMap = new HashMap<KeyObj, String>();
        KeyObj a = new KeyObj(1, false);
        KeyObj b = new KeyObj(2,true);

        String obj1 = "Cat";
        String obj2 = "Dog";

        hashMap.put(a, obj1);
        hashMap.put(b, obj2);

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        a.setA(0);
//        System.out.println(a.getA());
//        hashMap.put(a,"Frog");

        System.out.println(hashMap.get(a));

    }
}
