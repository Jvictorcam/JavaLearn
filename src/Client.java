public class Client implements Secure{
    
    private String name;
    private int psswd;

    public Client(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPsswd(int psswd){
        this.psswd = psswd;
    }
    public boolean auth(int psswd){
        return this.psswd == psswd;
    }
}
