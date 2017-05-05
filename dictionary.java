import java.io.*;

class dictionary
{
    public static void main(String args[])
    {
        int i;
        boolean flag = false;
        String sub, sub2, strf;
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
                sub2 = strf.substring(i+1,strf.length());
                if(str.equals(sub))
                {
                    //String[] splited = strf.split(":");
                    System.out.println(sub2);
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
    }
