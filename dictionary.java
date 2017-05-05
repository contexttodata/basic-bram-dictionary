import java.io.*;

class dictionary
{
    public static void main(String args[])
    {
        int i;
        boolean flag = false;
        String sub, strf;
        System.out.println("Hello i am bram defination library or B.D.L you can use type a word in and bram will tell you what he thinks");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            FileReader fr = new FileReader("dictionaryTXT.txt");
            BufferedReader bb = new BufferedReader(fr);

            while((strf = bb.readLine()) != null)
            {
                i = strf.indexOf(":");
                sub = strf.substring(0,i);
                if(str.equals(sub))
                {
                    System.out.println(strf);
                    flag=true;
                }

            }
            bb.close();

            if(!flag) {
                System.out.println("dosent look like anything to me");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*public Boolean error(Boolean flag) {
        if(!flag) {
            System.out.println("dosent look like anything to me");

    }
    return true;
    }*/
}
