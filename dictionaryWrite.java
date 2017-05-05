public class dictionaryWrite {

    public static void main() {

        try {

            Scanner scanner = new Scanner(System.in);
            String scannerOutput = scanner.next();
            System.out.println(scannerOutput + "saved to file");
            BufferedWriter bw = new BufferedWriter(new FileWriter("dictionaryTXT.txt", true));
            bw.write(scannerOutput);

            bw.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
