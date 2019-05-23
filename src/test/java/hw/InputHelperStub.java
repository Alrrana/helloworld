package hw;

public class InputHelperStub extends InputHelper {

    private int i = 0;
    private String[] in = {
            "5","1","2","3","4","5"
    };


    public String input() {
        i++;
        return in[i];
    }


}
