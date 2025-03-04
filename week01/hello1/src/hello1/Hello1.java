package hello1;
import java.util.*;
/**
 *Our first Java Program
 * @author JakeMey
 */
public class Hello1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = kb.nextLine();
        System.out.println("Hello " + name);
    }

}
