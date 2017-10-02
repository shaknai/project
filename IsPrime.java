import java.lang.Math;
import java.util.Scanner;


public class IsPrime{
    static Scanner scan = new Scanner(System.in);
        static boolean isDivide(long int1, long int2){
            if(int1%int2 == 0 ){
                return true;
            }
            else{
                return false;
        }
    }
    static boolean prime(long num){
        if(num == 2){
            return true;
        }
        if (num%2==0){
            return false;
        }
        else{
            for (int x=3; x<=Math.sqrt(num); x = x + 2){
                if (isDivide(num,x)){
                    return false;
                }
                if ( x == Math.sqrt(num)){
                    if (isDivide(num,x)){}
                    else{
                        return true;
                    }    
                }
            }
            return true;
        }
    }
    
    public static void main( String [] args){
        IsFibonnaci fibonnaci = new IsFibonnaci();
        int check;
        while(true){
            System.out.println("Enter a number");
            check = scan.nextInt();
            if (prime(check)){
                System.out.println(check + " is a prime number");
            }
            else{
                System.out.println(check + " is not a prime number");
            }
            if (fibonnaci.IsFibo(check)){
                System.out.println(check + " is a fibonnaci number");
            }
            else{
                System.out.println(check + " is not a fibonnaci number");
            }
        }
    }
}

