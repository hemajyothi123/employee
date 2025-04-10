class Employee {
    private int id;
    private String name;
    private float Salary;
    private String Designation;

    public int getid(){
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String Designation){
        this.Designation = Designation;
    }
}
public class Main1{
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setid(1);
        employee.setname("JAVA");
        employee.setSalary(50000.98f);
        employee.setDesignation("MCA");

        System.out.println("Employee Details");
        System.out.println("Employee ID"+employee.getid());
        System.out.println(employee.getname());
        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());
    }
}
    

