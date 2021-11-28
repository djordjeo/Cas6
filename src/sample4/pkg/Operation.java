package sample4.pkg;

public enum Operation {
    ADD(0), REMOVE(1), HEAD(2), BACK(3), SIZE(4), EXIT(5);

    public static Operation fromInt(int op){
        switch (op){
            case 0 : return ADD;
            case 1 : return REMOVE;
            case 2 : return HEAD;
            case 3 : return BACK;
            case 4 : return SIZE;
            case 5 :
            default: return EXIT;
        }
    }

    private final int op;

    private Operation(int op){
        this.op = op;
    }



}
