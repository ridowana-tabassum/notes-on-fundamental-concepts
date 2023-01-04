public class Student
{
    private String naam = "Zubaer Alam Bihim";
    private String rollNumber = "131";
    private String bloodGroup = "O+";

    public String getNaam ( ) {
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
}


public class AmiMainClass
{
    public static void main(String[] args){
        Student studenterJinishPotro = new Student();

        studenterJinishPotro.setBloodGroup("Fotka+");
        studenterJinishPotro.setRollNumber("420");

        String dewaNaam = studenterJinishPotro.getNaam();
        String dewaBlodGroup = studenterJinishPotro.getBloodGroup();
        String dewaRollNumber = studenterJinishPotro.getRollNumber();

        System.out.println("Tere Naam:"+dewaNaam+ ", Rokto:"+dewaBlodGroup +", Roll Number kida:"+dewaRollNumber);


        Student studenterJinishPotroAgain = new Student();
        studenterJinishPotroAgain.setRollNumber("101010");
        System.out.println(studenterJinishPotroAgain.getNaam()+" "+studenterJinishPotroAgain.getRollNumber());
    }
}