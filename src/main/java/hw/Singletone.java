package hw;

public enum Singletone {
    SORTS(new Sorts())
    ;

    private Sorts instance;
    public Sorts getInstance(){
        return instance;
    }

    Singletone(Sorts instance) {
        this.instance = instance;
    }
}
