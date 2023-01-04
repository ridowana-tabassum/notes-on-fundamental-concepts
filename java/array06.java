import java.util.Scanner;

public class array06 {
    public static void main(String[]args){

        //random shufling

        Scanner input=new Scanner(System.in);

        double[] mylist= new double[5];
        System.out.print("Enter "+ mylist.length +" array values: ");

        for(int i=0;i< mylist.length;i++){
            mylist[i]=input.nextDouble();
        }

        for(int i=0;i< mylist.length;i++){
            int a=(int)(Math.random()*mylist.length);
            double temp=mylist[i];
            mylist[i]=mylist[a];
            mylist[a]=temp;
            System.out.print(mylist[a]);
        }
    }
}

