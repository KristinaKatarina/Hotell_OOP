import java.util.ArrayList;
import java.util.List;

public class TubaNeljale extends Tuba implements VipTuba {

    private int öödeArv; // mitu ööd külastajad hotellis veedavad
    private List<String> paketid = new ArrayList<>(List.of("Hommikusöök:0")); // ekonoomia toa lisa paketid (hommikusöök on alati hinnas)

    // juhul kui tuba on kinni
    public TubaNeljale(String hotell, String toaNumber, boolean kasVIP, boolean kasTubaOnKinni, int öödeArv, List<String> lisaPaketid) {
        super(hotell, toaNumber, kasVIP, kasTubaOnKinni);
        this.öödeArv = öödeArv;
        if (!lisaPaketid.isEmpty())
            paketid.addAll(lisaPaketid);
    }

    // juhul kui tuba on vaba (siis ei ole ööde arvu ja paketti teada)
    public TubaNeljale(String hotell, String toaNumber, boolean kasVIP, boolean kasTubaOnKinni) {
        super(hotell, toaNumber, kasVIP, kasTubaOnKinni);
    }


    public void setÖödeArv(int öödeArv) {
        this.öödeArv = öödeArv;
    }


    public void setPaketid(List<String> paketid) {
        this.paketid = paketid;
    }

    // VIP toa hinna arvutamine
    public double VipToaHind() {
        return this.hindKokku() + 60 * this.öödeArv; //vip toa hind oleks nt 80 eurot
    }

    // pakettide hinna arvutamine
    double lisaPakettideHind() {
        double pakettideHind = 0;

        for (String pakett : paketid) {
            double paketiHind = (Integer.parseInt(pakett.split(":")[1])) * 1.5;
            pakettideHind += paketiHind;
        }
        return pakettideHind;
    }

    // leiame pakettide nimed ilma hinnata
    public List<String> pakettideNimed(){
        List<String> pakettideNimed = new ArrayList<>();
        for (int i = 0; i < paketid.size(); i++) {
            String nimi = paketid.get(i).split(":")[0];
            pakettideNimed.add(nimi);
        }
        return pakettideNimed;
    }

    @Override
    // kõikide broneeritud ööde hind ilma pakettideta
    public double öödeHind() {
        return 70 * this.öödeArv; // ühe öö hinnaks on 70 eurot
    }
}
