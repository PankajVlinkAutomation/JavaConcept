package AbstractPractice;

abstract public class Automobile {
    abstract public void brand();
    public void wheelSize(){
        System.out.println("Wheel size");
    }
}
class TataCar extends Automobile{
    @Override
    public void brand() {
        System.out.println("Tata Brand");
    }
    public static void main(String[] args) {
        TataCar tataCar=new TataCar();
        tataCar.brand();
        tataCar.wheelSize();

    }
}
