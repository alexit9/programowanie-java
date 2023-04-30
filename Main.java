public class Main {
    public static void main(String[] args){
        Statek myStatek = new Statek();
        myStatek.plyn();
        Samolot mySamolot = new Samolot();
        mySamolot.lec();
        Hydroplan myHydroplan = new Hydroplan();
        myHydroplan.lec();
        myHydroplan.plyn();
    }
}
