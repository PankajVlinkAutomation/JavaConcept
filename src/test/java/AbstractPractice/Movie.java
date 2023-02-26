package AbstractPractice;
interface Movie {
   public void south();
   public static void acting(){
       System.out.println("Acting ");
   }
}
interface KanadMovie{
    public static void kanad(){
    }
    public void kanadActing();

}
class Oscar implements Movie,KanadMovie{

    @Override
    public void south() {
        System.out.println("South Movies in Oscar");
}

    @Override
    public void kanadActing() {
        System.out.println("Best Kanad acting ");
    }
}
