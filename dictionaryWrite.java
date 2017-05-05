import java.io.*;
import java.util.Scanner;
class dictionary
{
    public static void main(String args[]) {
        System.out.println("Hello i am bram defination library or B.D.L you can type edit to add a new entry into B.D.L or say i want to ask you a question");
        Scanner Scanner = new Scanner(System.in);

        System.out.println("ENTER A COMMAND: ");
        String var1 = Scanner.nextLine();

        String var2 = "edit";

        String var3 = "i want to ask you a question";

        if( var1.equals(var2)){
            System.out.println("ENTERING EDIT MODE");
            dictionaryWrite.main();
        }
        else if( var1.equals(var3)){
            System.out.println("go ahead im listing");
            dictonaryReader.main(new String[] {});
        }
        else
            System.out.println("you fucked up the command");
        //dictionaryWrite.main();
