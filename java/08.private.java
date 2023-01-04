public class Student
{
    private String naam;
    private String rollNumber;
    private String bloodGroup;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Student(String naam, String rollNumber, String bloodGroup) {
        this.naam = naam;
        this.rollNumber = rollNumber;
        this.bloodGroup = bloodGroup;
    }
}
public class AmiMainClass
{
    public static void main(String[] args){
       Student student = new Student("Bilkis", "123", "O+");

       System.out.println(student.getNaam());
       System.out.println(student.getRollNumber());
       System.out.println(student.getBloodGroup());


    }
}


alt+instert button eksathe press korba

import java.util.ArrayList;

public class AmiMainClass
{

    private static ArrayList<Student> studentArrayList;

    public static void main(String[] args){

        studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Bilkis", "123", "O+"));
        studentArrayList.add(new Student("Mofij", "456", "O-"));
        studentArrayList.add(new Student("James Vegabond", "007", "A+"));


        for (Student dataChaiDataNai: studentArrayList)
         {
            System.out.println(dataChaiDataNai.getNaam());
            System.out.println(dataChaiDataNai.getRollNumber());
            System.out.println(dataChaiDataNai.getBloodGroup());
        }

    }
}