package JianZhiOffer;

public class Singleton {
    private Singleton() {
    }
    private static Singleton intstance = new Singleton();
    public static Singleton getInstance(){
        return intstance;
    }
}
