package sample3.pkg;

public class Main {

    public static void main(String[] args) {
        Human h = new Human();
        foo(h);
        System.out.println(h instanceof Object);
        System.out.println(h instanceof EnglishLanguage);
        foo1(h);
    }

    static void foo(SerbianLanguage rs){
        rs.zdravo();
        rs.dovidjenja();
    }

    static void foo1(Object h){
        System.out.println(h instanceof Object);
        System.out.println(h instanceof EnglishLanguage);
    }

}
