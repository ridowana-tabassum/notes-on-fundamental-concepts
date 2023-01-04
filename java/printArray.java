import java.util.Scanner;


public class printArray {
    public static void main(String[]args){
        //initializing array with input value

        Scanner input=new Scanner(System.in);

        double[] mylist= new double[10];

        System.out.print("Enter "+ mylist.length +" array values: ");

        for(int i=0;i< mylist.length;i++){
            mylist[i]=input.nextDouble();
        }

        System.out.println("Array list [ "+ mylist.length +"] ");
        for(int i=0;i<mylist.length;i++){
            System.out.print(mylist[i]+" , ");
        }
    }
}
