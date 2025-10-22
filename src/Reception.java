import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Reception {
    public Member member;
    ArrayList<Member> memberList = new ArrayList<>();
    private String searchWord;
    LocalDate today = LocalDate.now();

    // här kollar vi vad som skrivs in och skriver användern ett namn eller person nummer kommer metoden att returna
    // true
    // annars false

    public boolean searchForMember(Scanner input) {

        System.out.println("Var god skriv in namn( Förnamn Efternamn) eller personummer(YYMMDD-XXXX)");
        searchWord = input.nextLine().trim();
        if (searchWord.equalsIgnoreCase("Exit")) {
            System.out.println("Avslutar programmet");
            return false;
        }
        return true;

    }

    public void checkIfMatch() {

        boolean match = false;
        // här gör vi en for loop för att itterera igenom våran memberList
        for (int i = 0; i < memberList.size(); i++) {

            // här hämtar vi Member objekt som är lagrat på index i
            member = memberList.get(i);
            // här använder vi LocalDate och parsar till dett LocalDate objekt för att java kan inte tolka datum igenom Strängar.
            LocalDate dateFromFile = LocalDate.parse(member.getLastPayed().trim());

            // här söker vi efter namn eller personnummer.
            if (member.getName().equalsIgnoreCase(searchWord) || member.getPersonalId().equalsIgnoreCase(searchWord)) {
                match = true;

                // om namn eller person nummer stämmer
                // kollar vi om datumen från filen + 1 år är efter idag. om inte är det en medlem som inte har betalat
                if (dateFromFile.plusYears(1).isAfter(today)) {

                    InformationPrinter informationPrinter = new InformationPrinter();
                    informationPrinter.printMember(member);
                    informationPrinter.writeToFile(member);

                } else {
                    System.out.println("Medlem hittades men har inte betalat");
                    InformationPrinter informationPrinter = new InformationPrinter();
                    informationPrinter.writeToFile(member);

                }

            }

        }
        // om varken person nummer eller namn finns så finns inte medlemmen.
        if (!match) {
            System.out.println("Medlemen hitades inte.");

        }


    }

}
