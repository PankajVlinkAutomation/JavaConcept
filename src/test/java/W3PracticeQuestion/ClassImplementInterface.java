package W3PracticeQuestion;

interface C{
    public void show();
}
class D implements C{
    public void show(){
        System.out.println("show");
    }
}
public class ClassImplementInterface {
    public static void main(String[] args) {
        D obj=new D();
        obj.show();
    }
}
