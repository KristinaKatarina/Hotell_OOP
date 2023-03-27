import java.util.ArrayList;
import java.util.List;

public class Hotell {

    private String riik; // Kus riigis meie hotell asub, näiteks Eesti.
    private String aadress; // Meie hotelli aadress, naiteks Rävala tee 3
    private int hotelliReiting; // Meie hotelli reiting, näiteks 5 (viie tärni hotell)
    private int asutamisAasta; // Meie hotelli astutamise aasta, näiteks 2020.
    private List<Tuba> toadHotellis; // Jätame meelde meelde mis toad hotellis üldse olemas on.

    private List<Integer> klientideHinnangud; // Meie hotelli klientide reiting, iga element (0-5), näiteks saame võimalusel küsida kui klient lahkub.

    public Hotell(String riik, String aadress, int hotelliReiting, int asutamisAasta) {
        this.riik = riik;
        this.aadress = aadress;
        this.hotelliReiting = hotelliReiting;
        this.asutamisAasta = asutamisAasta;
        this.toadHotellis = new ArrayList<>();
    }

    public void loeSisseTuba(Tuba tuba){
        // Loeme hotelli sisse toa.
        toadHotellis.add(tuba);
    }

    public void lisaHinnang(int uusReiting){
        // Kui klient on kuhugi sisendisse meile andnud tagasiside arvustuse vahemikus (0-5) siis salvestame selle.
        if (uusReiting >= 0 && uusReiting <= 5)
            klientideHinnangud.add(uusReiting);
    }

    public double arvutaHinnang(){
        // Arvutame meie hotelli klientide keskmise hinnagu. näiteks saame 4.3 viiest.
        double hinnangudKokku = 0.0;
        for (Integer hinnang : this.klientideHinnangud){
            hinnangudKokku += hinnang;
        }
        return hinnangudKokku / this.klientideHinnangud.size();
    }

    @Override
    public String toString() {
        return "Hotell{" +
                "riik='" + riik + '\'' +
                ", aadress='" + aadress + '\'' +
                ", hotelliReiting=" + hotelliReiting +
                ", asutamisAasta=" + asutamisAasta +
                ", toadHotellis=" + toadHotellis +
                ", klientideHinnangud=" + klientideHinnangud +
                '}';
    }
}
