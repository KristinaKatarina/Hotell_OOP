import java.util.ArrayList;
import java.util.List;

public class TubaNeljale extends Tuba implements VipTuba{

    private int öödeArv;
    private List<String> paketid = new ArrayList<>(List.of("Hommikusöök"));

    // juhul kui tuba on kinni
    public TubaNeljale(String toaNumber, boolean kasVIP, boolean kasTubaOnKinni, int öödeArv, List<String> lisaPaketid) {
        super(toaNumber, kasVIP, kasTubaOnKinni);
        this.öödeArv = öödeArv;
        if (!lisaPaketid.isEmpty())
            paketid.addAll(lisaPaketid);
    }

    // juhul kui tuba on vaba (siis ei ole ööde arvu ja paketti teada)
    public TubaNeljale(String toaNumber, boolean kasVIP, boolean kasTubaOnKinni) {
        super(toaNumber, kasVIP, kasTubaOnKinni);
    }

    public double VipToaHind() {
        return hindKokku() + 80; //vip toa hind oleks nt 80 eurot
    }

    @Override
    public double öödeHind() {
        return 70 * this.öödeArv; // panin ühe öö hinnaks 70
    }

    @Override
    double lisaPakettideHind() {
        double pakettideHind = 0;

        for (String pakett : paketid) {
            double paketiHind = (Integer.parseInt(pakett.split(";")[1])) * 1.5; // tegin paketi 1,5 korda kallimaks,
            pakettideHind += paketiHind;                                            // sest toas on rohkem inimesi
        }
        return pakettideHind;
    }


}
