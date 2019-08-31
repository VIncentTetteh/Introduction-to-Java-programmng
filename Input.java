// import the scanner class to accept input
import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        // create an instance of the class Scanner
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter your name ");
        // asign your variable to the new instance with the extension nextLine function
        name = input.nextLine();
    }
}
