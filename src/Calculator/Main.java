package Calculator;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        FileWriter fw = new FileWriter("src/Calculator/output.txt", true);
        FileReader fr = new FileReader("src/Calculator/input.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            double f = 0;
            try{
            double ArgumentOne = scan.nextDouble();
            String Operator = scan.next();
            double ArgumentTwo = scan.nextDouble();


            if (Operator.equals("+") || Operator.equals("-") || Operator.equals("*") || Operator.equals("/")) {
            } else {
                System.out.println("Operation Error!");
                fw.write("Operation Error!" + "\n");
            }
            if (ArgumentTwo != 0.0) {
                if (Operator.equals("+")) {
                    System.out.println(ArgumentOne + ArgumentTwo);
                    f = ArgumentOne + ArgumentTwo;
                    fw.write(ArgumentOne + " + " + ArgumentTwo + " = " + f + "" + "\n");
                }
                if (Operator.equals("-")) {
                    System.out.println(ArgumentOne - ArgumentTwo);
                    f = ArgumentOne - ArgumentTwo;
                    fw.write(ArgumentOne + " - " + ArgumentTwo + " = " + f + "\n");
                }
                if (Operator.equals("*")) {
                    System.out.println(ArgumentOne * ArgumentTwo);
                    f = ArgumentOne * ArgumentTwo;
                    fw.write(ArgumentOne + " * " + ArgumentTwo + " = " + f + "\n");
                }
                if (Operator.equals("/")) {
                    System.out.println(ArgumentOne / ArgumentTwo);
                    f = ArgumentOne / ArgumentTwo;
                    fw.write(ArgumentOne + " / " + ArgumentTwo + " = " + f + "\n");
                }
            } else {
                System.out.println("Error! Division by zero");
                fw.write("Error! Division by zero" + "\n");
            }
        }catch (Exception ex) {
                System.out.println("Error! Not number");
                fw.write("Error! Not number" + "\n");
                    String j = scan.next();
            }
        }








    fw.close();
    fr.close();

    }
}
