import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number to check prime number");
        int n=sc.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
            cnt++;
            }
        }
        if(cnt==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");   
        }
    }
}