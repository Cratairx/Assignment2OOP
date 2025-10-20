import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteToPtFile {



    public void writeToFile(String member){

        try(FileWriter fileWriter = new FileWriter("PtFile", true); // append true här för att inte göra en ny fil varje gång som skriver över det som redan finns,
            PrintWriter writer = new PrintWriter((fileWriter))){
            writer.println(member);



        }catch (Exception e){

            e.printStackTrace();

        }

    }
}
