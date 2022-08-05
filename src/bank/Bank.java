

        
        
package bank;

import java.util.Scanner;
public class Bank {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String name = null ;String pas=null;
        
        int choice, draw, deposit;
        
        User user = new User();
        
        System.out.println("مرحبا بك في البنك المركزي");
        
        while(user.login(name, pas)){
            
            System.out.print("Entrer the name :");
            
            name=input.next();
            
            System.out.print("Entrer the pass :");
            
            pas=input.next();
        }
        
            
           
        }
        
    
            
     
        }
            
        
        

           
            

