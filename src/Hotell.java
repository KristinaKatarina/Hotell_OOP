import java.util.ArrayList;
import java.util.List;

public class Hotell {

    private String nimi;
    private String riik; // Kus riigis meie hotell asub, näiteks Eesti.
    private String aadress; // Meie hotelli aadress, naiteks Rävala tee 3
    private List<Tuba> toadHotellis; // Jätame meelde meelde mis toad hotellis üldse olemas on.

    public Hotell(String nimi,String riik, String aadress, int hotelliReiting, int asutamisAasta) {
        this.nimi = nimi;
        this.riik = riik;
        this.aadress = aadress;
        this.toadHotellis = new ArrayList<>();
    }

    public String getNimi() {
        return nimi;
    }

    public List<Tuba> getToadHotellis() {
        // Tagastab kõik hotelli toad. Ekonoomia ja VIP toad.
        return toadHotellis;
    }

    public String getAadress(){
        return riik + ", " + aadress;
    }

    public void loeSisseTuba(Tuba tuba){
        // Loeme hotelli sisse toa.
        toadHotellis.add(tuba);
    }

    @Override
    public String toString() {
        return "Teie valitud hotelli aadress on: " + riik + ", " + aadress;

    }
}
