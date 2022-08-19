import java.lang.ref.Cleaner;

abstract class Employee{
    
    private String name;
    protected double salary;
    
    public void setSalary(double salary){
        this.salary = salary;
    }

    abstract public double getBonus();
    
    public Employee(String s){
        this.name = s;
    } // Initialize Employee with name
    public Employee(){} // Initialize Employee without info
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


}