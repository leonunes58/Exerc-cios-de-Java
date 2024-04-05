package Entities;

public class Users {
    private int id;
    private String name;
    private  double salary;

    public Users(int id, String name, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }

    public Users() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double aumentoSalario(double porcentagem, double salario) {
        return this.salary +=  salario * porcentagem/100;
    }
}
