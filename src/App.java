
public class App{

    public void auth(Secure f){
        int psswd = 123;

        if(f.auth(psswd) == true){
            System.out.println("Welcome to System");
        }

    }
    public static void main(String[] args) {


    } 
}