import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> paketid = new ArrayList<>();
        Tuba tuba = new TubaNeljale("1", false,true,true,5,paketid);
        paketid.add("spa");
        Tuba tubaNr3 = new TubaKahele("3", true,true,true,7,paketid);
        Tuba vip = new TubaNeljale("2",true,false,false,0,paketid);
        Kampaania kampaania = new Kampaania(vip);
        kampaania.lisaKampaaniasse(tuba);
        kampaania.lisaKampaaniasse(tubaNr3);
        kampaania.muudaVõitjaTuba();



    }
}