import java.util.Scanner;

public class array05 {
    public static void main(String[]args){
        //finding the largest element

        Scanner input=new Scanner(System.in);

        double[] mylist= new double[5];

        System.out.print("Enter "+ mylist.length +" array values: ");

        for(int i=0;i< mylist.length;i++){
            mylist[i]=input.nextDouble();
        }
        System.out.println();


        double max=mylist[0];
        double min=mylist[0];

        for(int i=0;i< mylist.length;i++){
            if(mylist[i]>max)
                max=mylist[i];
        }
        System.out.println("largest element: "+ max);

        for(int i=0;i< mylist.length;i++){
            if(mylist[i]<min)
                min=mylist[i];
        }
        System.out.println("smallest element: "+ min);
    }

}