import java.util.Scanner;
public class array03 {
    public static void main(String[]args){
        // printing array

        Scanner input=new Scanner(System.in);
        double[] mylist= new double[10];
        System.out.print("Enter "+ mylist.length +" array values: ");

        for(int i=0;i<mylist.length;i++){
            System.out.print(mylist[i]+" , ");
        }
    }

}