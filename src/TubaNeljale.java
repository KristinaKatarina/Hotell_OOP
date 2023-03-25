import java.util.ArrayList;
import java.util.List;

public class TubaNeljale extends Tuba {
    private int öödeArv;
    private List<String> paketid = new ArrayList<>(List.of("Hommikusöök"));


    public TubaNeljale(String toaNumber, boolean kasVIP, boolean kasTubaOnKinni, boolean kasTubaKahele, int öödeArv, List<String> lisaPaketid) {
        super(toaNumber, kasVIP, kasTubaOnKinni, kasTubaKahele);
        this.öödeArv = öödeArv;
        if (!lisaPaketid.isEmpty())
            paketid.addAll(lisaPaketid);

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
