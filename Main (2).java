import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to print its digit");
        int n=sc.nextInt();
        int mod=0;
        int temp=n;
        while(temp!=0){
         temp=temp/10;
        mod++;
        }
        int div=(int)Math.pow(10,mod-1);
        while(div!=0){
            int q=n/div;
            System.out.println(q);
            n%=div;
            div/=10;
        }
    }
}