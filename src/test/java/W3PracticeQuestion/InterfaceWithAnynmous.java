package W3PracticeQuestion;

@FunctionalInterface
interface B{
    void play();
}

public class InterfaceWithAnynmous {
    public static void main(String[] args) {
        //Anynoumos class:-
        B obj=new B(){
          public void play(){
              System.out.println("Play");
          }
        };

        obj.play();
    }
}
