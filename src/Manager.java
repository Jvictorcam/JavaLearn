class Manager extends Employee implements Secure{

    public double getBonus(){
        return this.salary * 0.3;
    }

    public Manager(String name){
        super(name);
    }

    public Manager(Employee a){
        super(a.name);
    }
    public boolean auth(int psswd){
        return this.psswd == psswd;
    }
    public void setPsswd(int psswd){
        this.setPsswd(psswd);

    }

}