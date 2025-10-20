import java.io.File;
import java.util.Scanner;

public class ReadFromFile {


    public void FileReader() {
        Reception reception = new Reception();

        try (Scanner scanner = new Scanner(new File("GymNotes.txt"))) {

            if (scanner.hasNextLine()) {
                scanner.nextLine(); // tar bort första raden från strömmen.
            }

            while (true) {

                if (!scanner.hasNextLine()) {
                    break;
                }

                String rad = scanner.nextLine();
                // här splittas text filen vid varje semi kolon och läggs i en array där ordet före första semikolonet blir [0]
                String[] informationArrayFromFile = rad.split(";");
                // här skapar vi en nytt Member objekt med informationen från arrayen informationArrayFromFile
                Member member = new Member(informationArrayFromFile[0], informationArrayFromFile[1], informationArrayFromFile[2], informationArrayFromFile[3], informationArrayFromFile[4], informationArrayFromFile[5], informationArrayFromFile[6]);
                // här lägger vi till varje medlem i våran medlems lista.
                reception.memberList.add(member);

            }
            Scanner scanner1 = new Scanner(System.in);

            while (true) {

                // eftersom jag har gjort searchForMember till en boolean som tar in en input så
                // kommer denna att veta om den är true eller false beroende på vad användaren skriver
                //  blir det false så breaker vi loopen och avslutar programmet
                // annars fortsätter vi.
                if (!reception.searchForMember(scanner1)) {
                    break;
                }

                reception.checkIfMatch();

            }


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

