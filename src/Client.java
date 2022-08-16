public class Client implements Secure{
    
    String name;
    int psswd;

    public void setPsswd(int psswd){
        this.psswd = psswd;
    }
    public boolean auth(int psswd){
        return this.psswd == psswd;
    }
}
