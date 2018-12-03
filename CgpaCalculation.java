import java.util.Scanner;
public class CgpaCalculation
{
    public static void main(String args[])
    {
        int sub,lb,subTotal=0,labTotal=0;
        float total=0,credits;
        int[] theory,lab;
        theory = new int[10];
        lab = new int[5]; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Theory Subjects : ");
        sub = input.nextInt();
        System.out.print("Enter Number of Lab Subjects : ");
        lb = input.nextInt();
        for(int i=0;i<sub;i++)
        {
            System.out.println("Enter Theory Subject "+(i+1)+" Marks ");
            theory[i] = input.nextInt();
            subTotal += theory[i];
         }
        subTotal = subTotal*3;
        System.out.println("\n\n");
        for(int j=0;j<lb;j++)
        {
            System.out.println("Enter Lab Subject "+(j+1)+" Marks ");
            lab[j] = input.nextInt();
            labTotal += lab[j];
        }
        labTotal = labTotal*2;
        credits = (sub*3)+(lb*2);
        total = (subTotal+labTotal)/credits;

        System.out.println("CGPA : "+total);
    }
}