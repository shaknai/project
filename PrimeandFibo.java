public class PrimeandFibo{
    public static void main(String[] args){
        IsFibonnaci fibo = new IsFibonnaci();
        IsPrime prime = new IsPrime();
        System.out.println("Numbers that are prime and part of the Fibonnaci series are:");
        for(int check = 2; check < 10000; check+=1){
            if(fibo.IsFibo(check) && prime.prime(check)){
                System.out.println(check);
            }
        }
    }
}