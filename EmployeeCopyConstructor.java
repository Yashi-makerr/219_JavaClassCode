public class EmployeeCopyConstructor {
    int Emp_id;
    String Emp_name;

    EmployeeCopyConstructor(int i,String name){
        Emp_id=i;
        Emp_name=name;
    }
    EmployeeCopyConstructor(EmployeeCopyConstructor S2){
        Emp_id=S2.Emp_id;
        Emp_name=S2.Emp_name;
    }
    void printInfo(){
        System.out.println("Detalis of employee are: " +Emp_id+" "+Emp_name);
    }
    public static void main(String[] args){
        EmployeeCopyConstructor ecc= new EmployeeCopyConstructor(0, "Yashi");
        ecc.printInfo();
        EmployeeCopyConstructor copy=new EmployeeCopyConstructor(ecc);
        copy.printInfo();
        copy.Emp_id=200;
        //copy.Emp_name="Sikha";
        System.out.println("Details after changing the value::");
        copy.printInfo();
        ecc.printInfo();
        // EmployeeCopyConstructor copy;
        // copy=ecc;
        // copy.printInfo();

        // copy.Emp_id=2;
        // copy.Emp_name="Vaishnavii";
        // System.out.println("Details after change: ");
        // copy.printInfo();

        // ecc.printInfo();
    }
}
