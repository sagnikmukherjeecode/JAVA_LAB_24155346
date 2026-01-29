package day5.General;

public class Employee
{
    protected int empid;
    protected double basic;
    private String ename;

    public Employee(int id, String name, double basic)
    {
        empid = id;
        ename = name;
        this.basic = basic;
    }

    public double earnings()
    {
        return basic + (0.8 * basic) + (0.15 * basic);
    }
}
