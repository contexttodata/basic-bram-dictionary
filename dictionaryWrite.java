public class dictionaryWrite {

    public static void main() {
        boolean bp = true;
        try {

            Scanner scanner = new Scanner(System.in);
            String scannerOutput = scanner.next();
            System.out.println(scannerOutput + "saved to file");
            BufferedWriter bw = new BufferedWriter(new FileWriter("dictionaryTXT.txt"));
            bw.write(scannerOutput);


        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
