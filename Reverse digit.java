import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        while(n>0){
            int r=n%10;
            n/=10;
        System.out.println(r);
        }
    }
}