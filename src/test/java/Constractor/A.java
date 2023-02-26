package Constractor;

public class A {
    int id;
    String name;
    double salary;
    String address;

    A(int id,String address){
        this.id=id;
        this.address=address;
    }

    A(int a,String n,double d){
        this.id=a;
        this.name=n;
        this.salary=d;
    }
    public void detailsEmployee(){
        System.out.println("Id- "+id+", Name- "+name+", Salary- "+salary);
    }
    public void displayAddress(){
        System.out.println("Id- "+id+", Address- "+address);
    }

    public static void main(String[] args) {
        A obj=new A(1,"Durgesh",125000.45);
        A obj1=new A(2,"Mishra",24000.15);
        A obj2=new A(3,"Pramod",45000);
        A obj3=new A(4,"Shiv", 65000.45);
        obj.detailsEmployee();
        obj1.detailsEmployee();
        obj2.detailsEmployee();
        obj3.detailsEmployee();
        A display=new A(1,"Kanpur");
        A display1=new A(2,"Pratapgarh");
        A display2=new A(3,"Germany");
        display.displayAddress();
        display1.displayAddress();
        display2.displayAddress();
    }
}
