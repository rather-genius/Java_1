import java.io.*;

public class Main
{
    static int option = 0;
    public static void main(String []args)throws IOException
    {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

        String option_list = "Please select an option from below : \n 1. View Available Ingredients \n 2.Order Specific Ingredients \n 3.View Total Sales \n 4. View Total Expenses \n 5. View Net Profit \n 6. Place Order \n 7. Exit from the program";

        System.out.println(option_list);

        option = Integer.parseInt(input.readLine());

        Main m_object = new Main();
        m_object.show(option);
    }


    public void show (int option) throws IOException
    {
        if(option == 1)
        {
            System.out.println("1");
            Accounts a = new Accounts();
            a.show_data();
        }
        else if(option == 2)
        {
            System.out.println("2");
        }
        else if(option == 3)
        {
            System.out.println("3");
        }
        else if(option == 4)
        {
            System.out.println("4");
        }
        else if(option == 5)
        {
            System.out.println("5");
        }
        else if(option == 6)
        {
            System.out.println("6");
        }
        else if(option == 7)
        {
            System.out.println("7");
        }

        else{
            System.out.println("Please Select an appropriate option ..... ");
        }
    }

    public void wrong_choice()
    {

    }


}
