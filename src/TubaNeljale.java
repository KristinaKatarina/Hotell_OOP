import java.util.ArrayList;
import java.util.List;

public class TubaNeljale extends Tuba implements VipTuba {

    private int öödeArv;
    private List<String> paketid = new ArrayList<>(List.of("Hommikusöök:0"));

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

    public double VipToaHind() {
        return hindKokku() + 60 * öödeArv; //vip toa hind oleks nt 80 eurot
    }

    @Override
    public double öödeHind() {
        return 70 * öödeArv; // panin ühe öö hinnaks 70
    }


    double lisaPakettideHind() {
        double pakettideHind = 0;

        for (String pakett : paketid) {
            double paketiHind = (Integer.parseInt(pakett.split(":")[1])) * 1.5; // tegin paketi 1,5 korda kallimaks,
            pakettideHind += paketiHind;                                            // sest toas on rohkem inimesi
        }
        return pakettideHind;
    }
    public List<String> pakettideNimed(){
        List<String> pakettideNimed = new ArrayList<>();
        for (int i = 0; i < paketid.size(); i++) {
            String nimi = paketid.get(i).split(":")[0];
            pakettideNimed.add(nimi);
        }
        return pakettideNimed;
    }



}
