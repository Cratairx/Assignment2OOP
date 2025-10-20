import java.time.LocalDate;

public class TestClassWriteToFileMethod {
    LocalDate today = LocalDate.now();

    public void testWriting(Member member){


        System.out.println("Detta är en medlem");
        System.out.println("Namn: " + member.getName());
        System.out.println("Adress: " + member.getAdress());
        System.out.println("Personnummer: " + member.getPersonalId());
        System.out.println("Köpedatum: " + member.getBuyDate());
        System.out.println("Sista betalning: " + member.getLastPayed());
        System.out.println("Dagens datum: " + today);

    }

    public void writeToFile(Member member){

        System.out.println("Medlem hittades men har inte betalat");
        WriteToPtFile writeToPtFile = new WriteToPtFile();
        writeToPtFile.writeToFile(member.getName());
        writeToPtFile.writeToFile(member.getPersonalId());
        writeToPtFile.writeToFile("Tränade: " + today);

    }
}
