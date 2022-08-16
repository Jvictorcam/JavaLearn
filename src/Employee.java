abstract class Employee{
    
    protected String name;
    protected double salary;
    protected int psswd;
    public void setSalary(double salary){
        this.salary = salary;
    }

    abstract public double getBonus();

    public Employee(String s){
        this.name = s;
    }


}