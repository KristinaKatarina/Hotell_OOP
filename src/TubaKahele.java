import java.util.ArrayList;
import java.util.List;

public class TubaKahele extends Tuba implements VipTuba {
    // Tegemist on ökonoomia toaga

    private int öödeArv;
    private List<String> paketid = new ArrayList<>(List.of("Hommikusöök:0")); // Ekonoomia klassis on vaikeväärtusega paketis ainult hommikusöök, mis on hinna sees.
    protected double ööHind; // Siin on ööHind protected, kuna VIP toa puhul lisame hinnale lihtsalt VIP väärtuse otsa. (alamklass)

    //juhul kui tuba on kinni
    public TubaKahele(String hotell, String toaNumber, boolean kasVIP, boolean kasTubaOnKinni, int öödeArv, List<String> lisaPaketid) {
        super(hotell, toaNumber, kasVIP, kasTubaOnKinni);
        this.öödeArv = öödeArv;
        this.ööHind = 40;

        if (!lisaPaketid.isEmpty())
            paketid.addAll(lisaPaketid);
    }

    // juhul kui tuba on vaba (siis ei ole ööde arvu ja paketti teada)
    public TubaKahele(String hotell, String toaNumber, boolean kasVIP, boolean kasTubaOnKinni) {
        super(hotell, toaNumber, kasVIP, kasTubaOnKinni);
        this.ööHind = 40;
    }
    public void setÖödeArv(int öödeArv) {
        this.öödeArv = öödeArv;
    }

    public void setPaketid(List<String> paketid) {
        this.paketid = paketid;
    }

    public double VipToaHind() {
        // Meetod tagastab VIP toa broneeringu hinna.

        return this.hindKokku() + 30 * this.öödeArv;
    }

    public List<String> pakettideNimed(){
        // Meetod tagastab toale määratud lisapakettide nimed.

        List<String> pakettideNimed = new ArrayList<>();
        for (int i = 0; i < paketid.size(); i++) {
            String nimi = paketid.get(i).split(":")[0];
            pakettideNimed.add(nimi);
        }
        return pakettideNimed;
    }

    @Override
    public double öödeHind() {
        // Meetod arvutab kokku kliendi ööde hinna Hotellis.

        return this.öödeArv * this.ööHind;
    }

    @Override
    public double lisaPakettideHind() {
        // Meetod arvutab kokku kliendi pakettide hinna.

        double pakettideHind = 0;
        for (String pakett : paketid) {
            double paketiHind = Integer.parseInt(pakett.split(":")[1]); // Näiteks spaa;19.99 saame hinna 19.99.
            pakettideHind += paketiHind;
        }
        return pakettideHind;
    }
}
