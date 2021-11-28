package sample4.pkg;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.UnaryOperator.identity;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    //REPL Read-Eval-Print-Loop
    public static void main(String[] args) {
        Queue q = new ArrayQueue();

        showInstructions();
        //int i = scanner.nextInt();
        String opStr = scanner.next().toUpperCase();
        //Operation op = Operation.fromInt(i);
        Operation op = Operation.valueOf(opStr);
        while(op != Operation.EXIT){
            if(op == Operation.ADD){
                System.out.println("Enter element to add: ");
                Object el = scanner.nextInt();
                q.add(el);
            }
            else if(op == Operation.REMOVE){
                System.out.println("Removed: " + q.remove());
            }
            else if(op == Operation.SIZE){
                System.out.println("Size: " + q.size());
            }
            else if(op == Operation.HEAD){
                System.out.println("Head: " + q.head());
            }
            else if(op == Operation.BACK){
                System.out.println("Back: " + q.back());
            }
            q.show();
            showInstructions();
            //op = Operation.fromInt(scanner.nextInt());
            op = Operation.valueOf(scanner.next().toUpperCase());
        }
    }

    private static void showInstructions(){
        System.out.println("Enter operation: ");
        System.out.println("0 - Add");
        System.out.println("1 - Remove");
        System.out.println("2 - Head");
        System.out.println("3 - Back");
        System.out.println("4 - Size");
        System.out.println("5 - Exit");
    }

}
