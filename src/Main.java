import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Hotell> loeHotellid(String failiNimi) {
        List<Hotell> hotellid = new ArrayList<>();
        java.io.File fail = new java.io.File(failiNimi);
        try (Scanner sc = new Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                List<String> tükid = List.of(rida.split(";"));
                int reitinig = Integer.parseInt(tükid.get(3));
                int asutamisaasta = Integer.parseInt(tükid.get(4));
                Hotell hotell = new Hotell(tükid.get(1), tükid.get(2), reitinig, asutamisaasta);
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
                    if (kasTubaOnKinni) {
                        Tuba tuba = new TubaKahele(tükid.get(1), kasVIP, true, ööd, paketid);
                        toad.add(tuba);
                    } else {
                        Tuba tuba = new TubaKahele(tükid.get(1), kasVIP, false);
                        toad.add(tuba);
                    }
                }
                if (!kasTubaOnKahele) {
                    if (kasTubaOnKinni) {
                        Tuba tuba = new TubaNeljale(tükid.get(1), kasVIP, true, ööd, paketid);
                        toad.add(tuba);
                    } else {
                        Tuba tuba = new TubaNeljale(tükid.get(1), kasVIP, false);
                        toad.add(tuba);
                    }

                }


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return toad;


    }


    public static void main(String[] args) {
        System.out.println(loeToad("Andmebaas.txt"));

    }
}