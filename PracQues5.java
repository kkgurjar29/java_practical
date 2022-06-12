//Practical Question - 5

import java.util.Scanner;
public class PracQues5
{
    static void conversion(int n)
    {
        int binary_num[] = new int[1000];
        int i=0;
        while(n>0)
        {
            binary_num[i] = n%2;
            n = n/2;
            i++;
        }
        for(int j=i-1; j>=0; j--)
        {
            System.out.println(binary_num[j]);
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int decimal = sc.nextInt();
        System.out.println("Decimal : " + decimal);
        System.out.println("Binary : ");
        conversion(decimal);
        sc.close();
    }
}