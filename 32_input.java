import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        // try {
        //     System.out.println("Enter a number ");
        //     int num = System.in.read(); // it will return ASCII value
        //     System.out.println(num); 
        // } catch(IOException e){
        //     System.out.println(e);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // -----------------------------------------------

        // System.out.println("Enter your details ");
        // InputStreamReader input = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(input);
        // try {
        //     String s = br.readLine();
        //     System.out.println(s);
        // } catch (IOException e) {
        //     System.out.println(e);
        // } catch (Exception e) {
        //    System.out.println(e);
        // } finally {
        //     try {
        //         br.close();
        //     } catch (IOException e) {
        //         System.out.println(e);
        //     }
        // }

        // -----------------------------------------------
        // latest way to handle inputs

        System.out.println("Enter your details ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);


    }
}