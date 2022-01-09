import java.util.*;
import java.io.*;

public class Accounts
{
    public void show_data()throws IOException
    {
        File file = new File("/Users/shwetanksrivastava/Desktop/My Computer/program files/JAVA/intelliJ/untitled folder/accounts.txt");

        List <String> l = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println("in show data");
        String st;
        while ((st = br.readLine()) != null)
        {
            l.add(st);
        }
        System.out.println(l.get(0));
    }
}
