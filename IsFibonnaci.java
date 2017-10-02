import java.util.Scanner;

public class IsFibonnaci{
    public static boolean IsFibo(int num){
        int x,y,z,d;
        x=0;
        y=1;
        z=1;
        
        while(z < num){
            d=y;
            z=x+y;
            y+=x;
            x=d;            
        }
        if(z == num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        for(int run = 0; run < 100; run += 1){
            if (IsFibo(run)){
                System.out.println(run);
            }
        }
        
     
    }
}