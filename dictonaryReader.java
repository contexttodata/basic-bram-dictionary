import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created by alexl on 5/5/2017.
 */
class dictonaryReader {
    public static void main(String args[]){
        int i;
        boolean flag = false;
        String sub, sub2, strf;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            FileReader fr = new FileReader("dictionaryTXT.txt");
            BufferedReader bb = new BufferedReader(fr);

            while ((strf = bb.readLine()) != null) {
                i = strf.indexOf(":");
                sub = strf.substring(0, i);
                sub2 = strf.substring(i + 1, strf.length());
                if (str.equals(sub)) {
                    //String[] splited = strf.split(":");
                    System.out.println(sub2);
                    flag = true;
                }

            }
            bb.close();

            if (!flag) {
                System.out.println("dosent look like anything to me");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
