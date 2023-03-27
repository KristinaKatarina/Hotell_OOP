import java.util.ArrayList;
import java.util.List;

public class TubaKahele extends Tuba implements VipTuba {
    // Tegemist on ökonoomia toaga

    private int öödeArv;
    private List<String> paketid = new ArrayList<>(List.of("Hommikusöök")); // Ekonoomia klassis on vaikeväärtusega paketis ainult hommikusöök, mis on hinna sees.
    protected double ööHind; // Siin on ööHind protected, kuna VIP toa puhul lisame hinnale lihtsalt VIP väärtuse otsa. (alamklass)

    //juhul kui tuba on kinni
    public TubaKahele(String toaNumber, boolean kasVIP, boolean kasTubaOnKinni, boolean kasTubaKahele, int öödeArv, List<String> lisaPaketid) {
        super(toaNumber, kasVIP, kasTubaOnKinni, kasTubaKahele);
        this.öödeArv = öödeArv;
        this.ööHind = 40; // Olgu 1 ökonoomia tuba kahele öö arv 40 eurot.

        if (!lisaPaketid.isEmpty()) // Kui meie klient ei soovinud kõike VIP teenuseid, vaid üksikuid teenuseid, siis lisame need paketti. Näiteks spaa.
            paketid.addAll(lisaPaketid); // Kui lisame lisapaketi, siis las olla see formaardis (paketi nimi);(hind). Näiteks spaa;20 . Nii saame lõpus selle 20 muuta Integer ja kokku arvutada hinna.
    }

    // juhul kui tuba on vaba (siis ei ole ööde arvu ja paketti teada)
    public TubaKahele(String toaNumber, boolean kasVIP, boolean kasTubaOnKinni, boolean kasTubaKahele) {
        super(toaNumber, kasVIP, kasTubaOnKinni, kasTubaKahele);
    }


    @Override
    public double öödeHind() {
        // Arvutame kokku kliendi ööde hinna Hotellis.
        return this.öödeArv * this.ööHind;
    }

    @Override
    public double lisaPakettideHind() {
        // Arvutame kokku kliendi pakettide hinna.
        double pakettideHind = 0;

        for (String pakett : paketid) {
            double paketiHind = Integer.parseInt(pakett.split(";")[1]); // Näiteks spaa;19.99 saame hinna 19.99.
            pakettideHind += paketiHind;
        }
        return pakettideHind;
    }


    @Override
    public double VipToaHind() {
        return hindKokku() + 40; //panin vip toa hinnaks 40 eurot
    }
}
