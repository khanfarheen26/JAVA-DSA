import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to count its digit");
        int n=sc.nextInt();
        int cnt=0;
        while(n>0){
            int r=n%10;
            cnt++;
            n/=10;
        }
        System.out.println(cnt);
        }
    }