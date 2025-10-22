import java.time.LocalDate;

public class InformationPrinter {
    LocalDate today = LocalDate.now();

    public void printMember(Member member){


        System.out.println("Detta är en medlem");
        System.out.println("Namn: " + member.getName());
        System.out.println("Adress: " + member.getAdress());
        System.out.println("Email: " + member.getEmail());
        System.out.println("Personnummer: " + member.getPersonalId());
        System.out.println("Köpedatum: " + member.getBuyDate());
        System.out.println("Sista betalning: " + member.getLastPayed());
        System.out.println("Medlemsskap " + member.getMemberShip());
        System.out.println("Dagens datum: " + today);

    }
    //  här skriver vi ut till pt filen varje medlem och att den tränade idag.
    public void writeToFile(Member member){


        WriteToPtFile writeToPtFile = new WriteToPtFile();
        writeToPtFile.writeToFile(member.getName());
        writeToPtFile.writeToFile(member.getPersonalId());
        writeToPtFile.writeToFile("Tränade: " + today);

    }
}
