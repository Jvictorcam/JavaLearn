class Manager extends Employee implements Secure{
    String psswd;

    public double getBonus(){
        return this.salary * 0.3;
    }

    public Manager(String name){
        super(name);
    } // create a manager with name included
    public Manager(){
        super();
    } // create a manager without any info

    public boolean auth(String psswd){
        return this.psswd.equals(psswd);
    }
    public void setPsswd(String psswd){
        this.setPsswd(psswd);
    }

}