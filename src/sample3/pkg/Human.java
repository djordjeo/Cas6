package sample3.pkg;

public class Human implements EnglishLanguage, SerbianLanguage{

    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void goodbye() {
        System.out.println("Goodbye");
    }

    @Override
    public void zdravo() {
        System.out.println("Zdravo");
    }

    @Override
    public void dovidjenja() {
        System.out.println("Dovidjenja");
    }
}
