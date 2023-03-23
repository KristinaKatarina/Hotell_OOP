import java.util.ArrayList;
import java.util.List;

public class Kampaania {
    private List<Tuba> kampaaniaToad;
    private Tuba võidetavTuba; //anname ette vip toa, mille saab võita

    public Kampaania( Tuba võidetavTuba) {
        this.kampaaniaToad = new ArrayList<>();
        this.võidetavTuba = võidetavTuba;
    }

    public void lisaKampaaniasse(Tuba tuba) {
        kampaaniaToad.add(tuba);
    }

    private Tuba leiaVõitja() {
        int juhuslikArv = (int) Math.round(Math.random() * (kampaaniaToad.size()-1));
        Tuba võitja = kampaaniaToad.get(juhuslikArv);
        return võitja;

    }

    public void muudaVõitjaTuba() {
        Tuba võitja = leiaVõitja();
        if (võidetavTuba.isKasTubaOnKinni() || võidetavTuba.isKasVIP() == false) {      //juhul kui VIP tuba on juba kinni
            System.out.println("Kamapaanias võidetav tuba ei vasta tingimustele");      // või on tavaline tuba

        } else {
            kampaaniaToad.remove(võitja);
            võitja.setKasTubaOnKinni(false);
            võidetavTuba.setKasTubaOnKinni(true);
            System.out.println("Kampaania võitis tuba number " + võitja.getToaNumber() +
                    ", selles toas viibivad külalised tõsteti ümber VIP tuppa " + võidetavTuba.getToaNumber());
        }

    }

}
