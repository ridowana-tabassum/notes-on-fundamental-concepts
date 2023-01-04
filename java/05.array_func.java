private static ArrayList<String> arrayList;
    private static int count = 0;
    private static Scanner scanner;

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        arrayList= new ArrayList<>();

        while(count < 5){
            System.out.println("Input Value: ");
            String value = scanner.next();
            arrayList.add(value);
            count++;
        }

        for(String value : arrayList){
            System.out.println("Value: "+value);
        }
    }

import java.util.ArrayList;
import java.util.Scanner;

public class ClassLearning {

    private static ArrayList<String> arrayList;

    private final static String EXIT_CODE="E";
    private final static String CONTINUE_CODE="C";

    private static boolean shouldIConitnue = true;

    private static Scanner scanner;

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        arrayList= new ArrayList<>();

        while(shouldIConitnue){
            System.out.println("Input Value: ");
            String value = scanner.nextLine();
            arrayList.add(value);
            System.out.println("Do you want to continue?\nType C to continue and E to exit");
            String code = scanner.nextLine();
            if (code.equals(EXIT_CODE)){
                shouldIConitnue = false;
            }
            else if (code.equals(CONTINUE_CODE)){
                shouldIConitnue = true;
            }
            else{
                shouldIConitnue = false;
                System.out.println("Tui faltu user");
            }
        }

        for(String value : arrayList){
            System.out.println("Value: "+value);
        }
    }
}