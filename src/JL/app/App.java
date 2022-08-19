
public class App{
   
    public static void main(String[] args) {
        InternSys Sys = new InternSys(); // App-System operator 
        
        Client client = new Client();
        Sys.setName(client);
        Sys.setPsswd(client);
        
        Sys.auth(client);
        Sys.Wait(3);
        Sys.Clear();
        
        System.out.println("All tests done succesfully!!!");
        Sys.Wait(4);

    } 
}