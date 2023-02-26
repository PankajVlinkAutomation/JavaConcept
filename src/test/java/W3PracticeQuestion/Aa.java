package W3PracticeQuestion;

@FunctionalInterface
interface I{
    void show();
    //void add();
}
class Ram implements I{
    public void show(){
        System.out.println("showing");
    }
}

public class Aa {
    public static void main(String[] args) {
        Ram obj=new Ram();
        obj.show();
    }
}
