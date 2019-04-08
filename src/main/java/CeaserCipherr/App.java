import java.io.Console;





public class App {
    public static void main(String[] args) {
        Console myConsole= System.console();
        System.out.println("Enter your message");
        CeaserCipherr myCaesarCipherr = new CeaserCipherr();
        String myInputtedString = myConsole.readLine();

        String encryptedResult = myCeaserCipherr.runCeaserCipherr(myInputtedString, 3);
        System.out.println(encryptedResult);
    }
}