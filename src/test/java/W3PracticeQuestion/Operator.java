package W3PracticeQuestion;

interface Interface{
    void solution();
    void play();

}

public class Operator {
    public static void main(String[] arg){
        int a=5;
        int b=3;
        int result=a/b;//divide
        System.out.println("Quotient = "+result);
        int res=a%b;//Modulus
        System.out.println("Reminder = "+res);
        Interface obj = new Interface(){
            @Override
            public void solution(){
                System.out.println("solution");
            }
            @Override
            public void play(){
                System.out.println("play");
            }
        };
        obj.solution();
        obj.play();
    }


}
