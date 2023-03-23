public class Main {
    public static void main(String[] args) {
        /*kiire näidis kampaania tööst, kui andmebaas on
        valminud, siis tuleb paar tsüklit selle asemel teha
         */
        Tuba tuba = new Tuba("1", false,false,true);
        Tuba tubaNr3 = new Tuba("3", true,false,true);
        Tuba vip = new Tuba("2",true,true,false);
        Kampaania kampaania = new Kampaania(vip);
        kampaania.lisaKampaaniasse(tuba);
        kampaania.lisaKampaaniasse(tubaNr3);
        kampaania.muudaVõitjaTuba();

    }
}