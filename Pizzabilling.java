package P1;

import java.util.Scanner;


public class Pizzabilling 
{

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        
        int price=0;
        while(true){
            System.out.println("Enter pizza size(small/medium/large): ");
            String size=scanner.nextLine().toLowerCase();
            
            if(size.equals("small")){
                price=100;
            }
            else if(size.equals("medium")){
                price=200;
            }
            else if(size.equals("large")){
                price=300;
            }
            else{
                System.out.println("invalid! Try again");
                continue;
               
              }
            System.out.println("Do you want peporoni(yes/no):  ");
            String peporoni=scanner.nextLine().toLowerCase();
            
            if(size.equals("small")){
                if(peporoni.equals("yes"))
                    price=price+30;
                else
                    price=price+50;
            }
            
            
           
            
            
        System.out.println("Do you want extra cheese(yes/no):   ");
           String cheese= scanner.nextLine().toLowerCase();
           if(cheese.equals("yes"))
               price=price+20;
        
           
           System.out.println("Your final bill is:" + price+"RS");
         
    
        
    }
}
}
