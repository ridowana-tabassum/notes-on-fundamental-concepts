
import java.util.Scanner;
public class array04 {
    public static void main(String[]args){
        // Summing all elements

        Scanner input=new Scanner(System.in);

        double[] mylist= new double[4];

        System.out.print("Enter "+ mylist.length +" array values: ");

        for(int i=0;i< mylist.length;i++){
            mylist[i]=input.nextDouble();
        }

        double sum=0;
        for(int i=0;i< mylist.length;i++){
            sum=sum+mylist[i];
        }

        System.out.println("Sum of the array list is : "+ sum);

    }

}
