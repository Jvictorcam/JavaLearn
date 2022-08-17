import java.util.*;
public class App{

    
    
    public static void auth(Secure e){
        Scanner input = new Scanner(System.in);
        int psswd = input.nextInt();

        if(e.auth(psswd) == true){
            System.out.println("Welcome to System");
        } else{
            System.out.println("Wrong password");
            System.exit(1);
        }
        input.close();
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Client client = new Client("Mark");
        System.out.println("Set the " + client.getName() + " password:");
        client.setPsswd(input.nextInt());
        
        System.out.println("Now, Check the password:");
        auth(client);




        
        input.close();
    } 
}