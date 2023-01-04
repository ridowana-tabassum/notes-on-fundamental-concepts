public class AmiEktaClas
{
    public String agerNaam = "Zubaer Alam";
    public String porerNaam = "Bihim";

    public void naamPrintKor()
    {
        System.out.println(agerNaam+" "+porerNaam);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ClassLearning {

    public static void main(String[] args) {

        AmiEktaClas asd = new AmiEktaClas();
        /System.out.println(asd.agerNaam);
        System.out.println(asd.porerNaam);/
        asd.naamPrintKor();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("");
        Scanner scanner = new Scanner(System.in);
    }
}