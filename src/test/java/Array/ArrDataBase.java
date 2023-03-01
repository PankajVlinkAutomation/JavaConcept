package Array;

public class ArrDataBase {
    //Instance Variable or Global variable:

    int id;
    String name;
    long mobileNumber;
    String address;

    public static void main(String[] args) {
        ArrDataBase obj1=new ArrDataBase();
        obj1.id=1;
        obj1.name="James";
        obj1.address="Germany";
        obj1.mobileNumber= 1234567839L;

        ArrDataBase obj2=new ArrDataBase();
        obj2.id=2;
        obj2.name="Chris";
        obj2.address="America";
        obj2.mobileNumber=9287654321L;

        ArrDataBase obj3=new ArrDataBase();
        obj3.id=3;
        obj3.name="Jackson";
        obj3.address="United";
        obj3.mobileNumber=2345678901L;

        ArrDataBase [] array=new ArrDataBase[3];
        array[0]=obj1;
        array[1]=obj2;
        array[2]=obj3;
//print Array By Loop:-
        for (int i=0;i< array.length;i++)
        {
            System.out.println(" " +array[i].id+" | "+array[i].name+" | "+array[i].address+" | "+array[i].mobileNumber);
        }
//Print array by Enhanced Loop:-
        for (ArrDataBase base:array){
            System.out.println(" " +base.id+" | "+base.name+" | "+base.address+" | "+base.mobileNumber);
        }

    }
}
