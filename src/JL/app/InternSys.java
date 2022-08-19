package JL.app;

import java.util.*;
import java.util.concurrent.TimeUnit;

import JL.models.Secure;

public class InternSys{
    Scanner input = new Scanner(System.in);

    public void Clear(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } // clean screen

    public void Wait(int n){
        try{
             TimeUnit.SECONDS.sleep(n);
        } catch(InterruptedException err){
            System.err.println("Runtime error: INTERNSYS_AUTH_SLEEP_INTERRUP");
        }
    } // sleep the program n seconds

    public void auth(Secure e){    
        System.out.println("Password: ");
        String psswd = input.next();

        if(e.auth(psswd) == true){
            System.out.println("Welcome to System");
        
        } else{
            System.out.println("Wrong password");
            
            for(int i = 3 ; i > 0 ; i--){
                System.out.println("Exiting in " + i + "...");
                Wait(1);
                Clear();
            }
            input.close();
            System.exit(1); 
        }
        
        input.close();
    }

    public void setPsswd(Secure e){

        while(true){

            System.out.println("Choice a passsword: ");
            String temppsswd = input.next();

            System.out.println("Write the password again:");       
            String psswdcheck = input.next();
            
            if(temppsswd.equals(psswdcheck)){
                System.out.println("Password Set Success");
                e.setPsswd(temppsswd);
                Wait(1);
                Clear();
                break;

            } // if the passwords matchs, then, continue in main() 
            else{
                System.out.println(temppsswd + ' ' + psswdcheck);
                System.out.printf("\n\n");
                System.out.println("The passwords doesn't match, please try again..");
                Wait(1);
                Clear();
            } // if the both passwords typed by user are different, then, repeat the setter
        }  // The while() make the user put the password until the psswd and the checker match
        
    }


    public void setName(Object e){
        char confirmation;

        while(true){
            System.out.println("Please enter the client name: ");
            String name = input.next();

            System.out.println("The Client name is: " +  name + "?  [y/n]");
            confirmation = input.next().charAt(0);
            
            if(confirmation == 'n'){
                Clear();
                continue;    
            }
            if(confirmation == 'y'){
                System.out.println("Client name registered");
                Wait(2);
                Clear();
                break;
            }
            System.out.println(confirmation + " is an Invalid Option, please, do the process again");
            Wait(1);
            Clear();

        }


    }


}
