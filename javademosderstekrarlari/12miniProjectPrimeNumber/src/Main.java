public class Main {
    public static void main(String[] args) {

        int number = 5;
        int remainder = number % 2;
        boolean isPrime = true;

        if(number==1){
            System.out.println("Number is not prime number.");
        }
        if(number<1){
            System.out.println("Invalid Number");
        }

        for(int i=2; i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Number is prime.");
        }else{
            System.out.println("Number is not prime.");
        }
    }
}