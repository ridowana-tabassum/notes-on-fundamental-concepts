import java.util.Scanner;

public class array02 {
    public static void main(String[]args){
        //initializing array with random value

        double[] mylist= new double[3];

        for(int i=0;i< mylist.length;i++){
            mylist[i]=Math.random()*100;
        }

        System.out.println("Array list [ "+ mylist.length +"] ");
        for(int i=0;i<mylist.length;i++){
            System.out.print(mylist[i]+" , ");
        }
    }
}