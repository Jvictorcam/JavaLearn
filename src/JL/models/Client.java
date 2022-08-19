package JL.models;
public class Client implements Secure{
    
    private String name;
    private String psswd;

    public Client(String name){
        this.name = name;
    } // Initialize client with name
    public Client(){} // Initialize client without info

    public String getName(){
        return this.name;
    }

    public void setPsswd(String psswd){
        this.psswd = psswd;
    }
    public boolean auth(String psswd){
        return this.psswd.equals(psswd);
    }
}
