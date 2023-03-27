import java.util.ArrayList;
import java.util.List;

public class Kampaania {

    List<Tuba> kampaaniaToad = new ArrayList<>();

    public void lisaKampaaniasse(Tuba tuba) {
        kampaaniaToad.add(tuba);
    }

    private Tuba leiaVõitja() {
        int juhuslikArv = (int) Math.round(Math.random() * (kampaaniaToad.size()-1));
        Tuba võitja = kampaaniaToad.get(juhuslikArv);
        return võitja;
    }

    public void muudaVõitjaTuba(Tuba võidetavTuba) {
        Tuba võitja = leiaVõitja();
        if (võidetavTuba.isKasTubaOnKinni() || võidetavTuba.isKasVIP() == false) {      //juhul kui VIP tuba on juba kinni
            System.out.println("Kamapaanias võidetav tuba ei vasta tingimustele");      // või on tavaline tuba

        } else {
            kampaaniaToad.remove(võitja);
            võitja.setKasTubaOnKinni(false);
            võidetavTuba.setKasTubaOnKinni(true);
            // hiljem tuleb lisada kood, mis võidetud toa ööde arvu muudaks
            System.out.println("Kampaania võitis tuba number " + võitja.getToaNumber() +
                    ", selles toas viibivad külalised tõsteti ümber VIP tuppa " + võidetavTuba.getToaNumber());
        }

    }



}
