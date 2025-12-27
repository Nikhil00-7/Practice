import java.util.*;
public class p{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int num = sc.nextInt();

  
    
        if(num < 1){
      System.out.println("Invalid number ");
        return ;
    }

if(num == 1){
     System.out.println("Its a prime number");
}

boolean isPrime = true;
  for(int i = 2; i*i<num ; i++){
     if( num % i == 0){
        isPrime = false;
        break;
     }
  }    

  if(isPrime){
    System.out.println("Its a prime number" + " "+ num);
  }else{
     System.out.println("Its not a prime number"+ " "+ num);
  }

  System.out.println("Hello world");
    }

      static String helloPrint(){
        return  "Hello world " + "Nikhil ";
      }
}

