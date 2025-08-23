public class javamethod {
    int id;
    String name;
    javamethod(){
        // id=100;
        // name="Yashii";
        System.out.println("Details are: \n"+"id:" +id+"\n"+"Name:" +name);
    }
    javamethod(int id,String name){
        this.id=103;
        this.name="Meena";
    }
    public void displayMethod(){
        System.out.println(("Hello from display method"));
        System.out.println("Details are: \n"+"id:" +id+"\n"+"Name:" +name);
    }
    public static void main(String[] args)
    {
        javamethod m1=new javamethod();
        m1.name="Yashii";
        m1.id=100;
        m1.displayMethod();

        javamethod m2=new javamethod();
            m2.name="Yashi Kesarwani";
            m2.id=102;
            m2.displayMethod();
        
        javamethod m3=new javamethod(111,"Paraname");  ///parametrised constructor
        m3.displayMethod(); 

    }

}


