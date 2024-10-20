import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int inv=0;
        int op=1;
        while(n!=0){
            int od=n%10;
            int id=op;
            int ip=od;
            //to find the inverse using ip & id
            inv+=id*(int)Math.pow(10,ip-1);
            n/=10;
            op++;
        }
        System.out.println(inv);
    }
}