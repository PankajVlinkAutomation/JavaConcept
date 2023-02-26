package W3PracticeQuestion;

public class AyodhyaDham {
    int Count;
    String name;
    String talent;
    public AyodhyaDham(int count, String name, String talent) {
        Count = count;
        this.name = name;
        this.talent = talent;
    }
    public void detailsOfAyodhya(){
        System.out.println("Count- "+Count+" || "+"Name -"+name+" || "+"Talent -"+talent);
    }
    public static void main(String [] p){

        System.out.println("Kingdom of Universe Details:-");
        AyodhyaDham obj=new AyodhyaDham(1,"Shri Ram","Lord");
        AyodhyaDham obj1=new AyodhyaDham(2,"Lakshaman","Sheshnaag");
        AyodhyaDham obj2=new AyodhyaDham(3,"Bharat","King of Universe");
        AyodhyaDham obj3=new AyodhyaDham(4,"Shatrughan","Fighter");
        obj.detailsOfAyodhya();
        obj1.detailsOfAyodhya();
        obj2.detailsOfAyodhya();
        obj3.detailsOfAyodhya();

    }
}
