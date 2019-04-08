import java.io.Console;





public class App {
    public static void main(String[] args) {
        Console myConsole= System.console();
        System.out.println("Enter your message");
        CeaserCipherr myCeasarCipherr = new CeaserCipherr();
        String myInputtedString = myConsole.readLine();

        String encryptedResult =  myCeasarCipherr.runCeaserCipherr(myInputtedString, 3);
        System.out.println(encryptedResult);
    }
}