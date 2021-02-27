package BusinessLogicLayer;
import java.util.*;
import java.io.IOException;

import DataAccessLayer.DB;

public class Program
{
    public static void main(String[] args) 
    {
        Scanner NumOfPeople = new Scanner(System.in);
        System.out.print("Enter Number of People: ");   
        int Num = NumOfPeople.nextInt();      

        if(Num > 40)
        {
            int price;
            int newPrice = price / 15 * 100;
            System.out.print("Total adult's meal price: " + newPrice);
        }
    }
}