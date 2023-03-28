import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Hotell> hotellid = loeHotellid("Hotellid.txt");

    public static List<Hotell> loeHotellid(String failiNimi) {
        List<Hotell> hotellid = new ArrayList<>();
        java.io.File fail = new java.io.File(failiNimi);
        try (Scanner sc = new Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                List<String> tükid = List.of(rida.split(";"));
                int reitinig = Integer.parseInt(tükid.get(3));
                int asutamisaasta = Integer.parseInt(tükid.get(4));
                Hotell hotell = new Hotell(tükid.get(0), tükid.get(1), tükid.get(2), reitinig, asutamisaasta);
                hotellid.add(hotell);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return hotellid;

    }

    public static List<Tuba> loeToad(String failiNimi) {
        List<Tuba> toad = new ArrayList<>();
        java.io.File fail = new java.io.File(failiNimi);
        try (Scanner sc = new Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                boolean kasVIP = false;
                boolean kasTubaOnKinni = false;
                boolean kasTubaOnKahele = false;
                List<String> paketid = new ArrayList<>();
                String rida = sc.nextLine();
                List<String> tükid = List.of(rida.split(";"));
                if (tükid.get(2).equals("Kinni")) {
                    kasTubaOnKinni = true;
                }
                if (tükid.get(3).equals("VIP")) {
                    kasVIP = true;
                }
                if (tükid.get(4).equals("Kahene")) {
                    kasTubaOnKahele = true;
                }
                int ööd = Integer.parseInt(tükid.get(5));

                if (ööd != 0 && !kasVIP) {
                    try {
                        paketid = List.of(tükid.get(6).split(", "));

                    } catch (Exception e) {
                        continue;
                    }
                }
                if (kasTubaOnKahele) {
                    Tuba tuba;
                    if (kasTubaOnKinni) {
                        tuba = new TubaKahele(tükid.get(0), tükid.get(1), kasVIP, true, ööd, paketid);

                    } else {
                        tuba = new TubaKahele(tükid.get(0), tükid.get(1), kasVIP, false);
                    }
                    toad.add(tuba);
                    hotellideSidumineTubadega(tuba);
                } else {
                    Tuba tuba;
                    if (kasTubaOnKinni) {
                        tuba = new TubaNeljale(tükid.get(0), tükid.get(1), kasVIP, true, ööd, paketid);


                    } else {
                        tuba = new TubaNeljale(tükid.get(0), tükid.get(1), kasVIP, false);
                    }
                    toad.add(tuba);
                    hotellideSidumineTubadega(tuba);
                }
            }
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return toad;


    }

    public static void hotellideSidumineTubadega(Tuba tuba) {
        for (int i = 0; i < hotellid.size(); i++) {
            // kas hotelli nimi klappib hotelli nimega, kus tuba asub
            if (hotellid.get(i).getNimi().equals(tuba.getHotell())) {
                hotellid.get(i).loeSisseTuba(tuba);
            }
        }

    }

    public static List<Tuba> leiaVabadToad(List<Tuba> toad) {
        List<Tuba> sobilikudToad = new ArrayList<>();
        for (int i = 0; i < toad.size(); i++) {
            if (!toad.get(i).isKasTubaOnKinni()) {
                sobilikudToad.add(toad.get(i));
            }
        }
        return sobilikudToad;
    }

    public static List<Tuba> leiaVipToad(List<Tuba> toad, int tase) {
        List<Tuba> sobilikudToad = new ArrayList<>();
        if (tase == 1) {
            for (int i = 0; i < toad.size(); i++) {
                if (!toad.get(i).isKasVIP()) {
                    sobilikudToad.add(toad.get(i));
                }
            }
            return sobilikudToad;
        }
        if (tase == 2) {
            for (int i = 0; i < toad.size(); i++) {
                if (toad.get(i).isKasVIP()) {
                    sobilikudToad.add(toad.get(i));
                }
            }
            return sobilikudToad;
        }
        return sobilikudToad;
    }
    public static List<String> kasutajaPaketid(List<String> paketiNumbrid){
        List<String> paketid = new ArrayList<>();
        for (int i = 0; i < paketiNumbrid.size(); i++) {
            String pakett =  paketiNumbrid.get(i);
            if(pakett.equals("1")){
                paketid.add("bassein:10");
            }
            if(pakett.equals("2")){
                paketid.add("saun:7");
            }
            if(pakett.equals("3")){
                paketid.add("õhtusöök:15");
            }
            if(pakett.equals("4")){
                paketid.add("joogid hinnas:20");
            }

        }
        return paketid;
    }


    public static void main(String[] args) throws IOException {
        loeToad("Andmebaas.txt");
        Kasutajaliides kasutajaliides = new Kasutajaliides();
        List<List> kasutajaValikud = kasutajaliides.kysiKliendilt();
        int valitudHotelliNumber = Integer.parseInt((String) kasutajaValikud.get(0).get(0));
        int valitudToaSuurus = Integer.parseInt((String) kasutajaValikud.get(1).get(0));
        int valitudToaTase = Integer.parseInt((String) kasutajaValikud.get(2).get(0));
        int ööd = Integer.parseInt((String) kasutajaValikud.get(3).get(0));
        List<String> paketid =  kasutajaValikud.get(4);
        Hotell valitudHotell = hotellid.get(valitudHotelliNumber - 1);
        List<Tuba> hotelliToad = valitudHotell.getToadHotellis();
        // leiame hotelli toad, mis on vabad
        List<Tuba> vabadToad = leiaVabadToad(hotelliToad);
        if (valitudToaSuurus == 1) { // kas kasutaja soovib tuba kahele
            for (int i = 0; i < vabadToad.size(); i++) {
                if (vabadToad.get(i).getClass() == TubaNeljale.class) {
                    vabadToad.remove(i);

                }

            }
        } else if (valitudToaSuurus == 2) { // kas kasutaja soovib tuba neljale
            for (int i = 0; i < vabadToad.size(); i++) {
                if (vabadToad.get(i).getClass() == TubaKahele.class) {
                    vabadToad.remove(i);

                }
            }
        }
        List<Tuba> sobivadToad = leiaVipToad(vabadToad, valitudToaTase); //leiame vip/ekonoomia toad vastavalt kasutaja soovile
        if (sobivadToad.size() == 0) {
            System.out.println("Kahjuks ei ole hetkel sellist tuba saadaval");
        } else {
            //System.out.println(sobivadToad); //kontroll
            int juhuslikArv = (int) Math.round(Math.random() * (sobivadToad.size() - 1));
            Tuba valitudTuba = sobivadToad.get(juhuslikArv);
            valitudTuba.setKasTubaOnKinni(true);
            valitudTuba.setÖödeArv(ööd);
            if (valitudToaTase == 1 && !paketid.isEmpty()){
                List<String> valitudPaketid = kasutajaPaketid(paketid);
                valitudTuba.setPaketid(valitudPaketid);
            }
            System.out.println(valitudTuba);
            System.out.println(valitudHotell);

        }


    }
}