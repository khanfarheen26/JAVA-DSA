import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1=0;
        int a2=1;
        for(int i=1;i<n;i++){
            System.out.print(a1+" ");
            int s=a1+a2;
            a1=a2;
            a2=s;
        }
    }
}