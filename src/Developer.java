class Developer extends Employee{
    public double getBonus(){
        return this.salary * 0.25;
    }
    public Developer(String name){
        super(name);
    }
    
}
