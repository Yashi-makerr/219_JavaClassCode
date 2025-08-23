package kiet;

public class EmployeeKiet {
    public String Emp_Name;
    private int salary;
    protected int Emp_id;
    String Organisation;

    void employeeDetails(){
        System.out.println("Details od kiet employee are: " +"\n"+Emp_id+" "+"Emp_Name"+"\n");
    }
    public static void main(String[] args){
        EmployeeKiet ek=new EmployeeKiet();
        ek.Emp_Name="Yashi";
        ek.Emp_id=1;
        ek.salary=20000;
        ek.Organisation="KIET Groups";
        ek.employeeDetails();
    }
}
