import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Kasutajaliides {

    public List<List> kysiKliendilt() throws IOException { // Tagastab List [valitudHotell, öödeArv, valitudKlass, [pakett1, pakett2, jne]]

        List<List> vastus = new ArrayList<>();
        BufferedReader sisend = new BufferedReader(new InputStreamReader(System.in));

        List<String> valitudHotell = new ArrayList<>();
        while (true){
            System.out.println(" ________________________________________________________________________ ");
            System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
            System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
            System.out.println("| Millisele hotellile soovite tuba broneerida? (Sisestage vastav number) |");
            System.out.println("|                                                                        |");
            System.out.println("|         1 - Monsoon            2 - Paragon            3 - Orbit        |");
            System.out.println("|                                                                        |");
            System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

            System.out.print("                              Hotelli number: ");
            String valitudHotellSisend = sisend.readLine(); // Küsime hotelli.

            if (valitudHotellSisend.equals("1") || valitudHotellSisend.equals("2") || valitudHotellSisend.equals("3")){
                valitudHotell.add(valitudHotellSisend);
                vastus.add(valitudHotell);
                break;
            }
        }

        System.out.println();
        System.out.println();

        List<String> toaSuurus = new ArrayList<>();
        while (true){
            System.out.println(" ________________________________________________________________________ ");
            System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
            System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
            if (valitudHotell.get(0).equals("1"))
                System.out.println("|                       Teretulemast hotelli Monsoon!                    |");
            else if (valitudHotell.get(0).equals("2"))
                System.out.println("|                        Teretulemast hotelli Paragon!                   |");
            else if (valitudHotell.get(0).equals("3"))
                System.out.println("|                        Teretulemast hotelli Orbit!                     |");
            System.out.println("|                                                                        |");
            System.out.println("|      Valige mis suurusega tuba soovite (Sisestage vastav number)       |");
            System.out.println("|                                                                        |");
            System.out.println("|              1 - Tuba kahele               2 - Tuba neljale            |");
            System.out.println("|                                                                        |");
            System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
            System.out.print("                                Toa suurus: ");

            String toaSuurusSisend = sisend.readLine(); // Küsime toa suurust.

            if (toaSuurusSisend.equals("1") || toaSuurusSisend.equals("2")){
                toaSuurus.add(toaSuurusSisend);
                vastus.add(toaSuurus);
                break;
            }
        }

        System.out.println();
        System.out.println();

        List<String> valitudKlass = new ArrayList<>();
        while (true){
            System.out.println(" ________________________________________________________________________ ");
            System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
            System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
            System.out.println("|                      Millist tuba soovite broneerida?                  |");
            System.out.println("|                                                                        |");
            System.out.println("|              1 - Ekonoomia tuba                2 - VIP tuba            |");
            System.out.println("|                                                                        |");
            System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
            System.out.print("                                   Tuba: ");

            String valitudKlassSisend = sisend.readLine(); // Küsime toa suurust.

            if (valitudKlassSisend.equals("1") || valitudKlassSisend.equals("2")){
                valitudKlass.add(valitudKlassSisend);
                vastus.add(valitudKlass);
                break;
            }
        }

        System.out.println();
        System.out.println();

        List<String> öödeArv = new ArrayList<>();
        while (true){
            System.out.println(" ________________________________________________________________________ ");
            System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
            System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
            System.out.println("|                      Mitu ööd soovite hotellis veeta?                  |");
            System.out.println("|                                                                        |");
            System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
            System.out.print("                                  Ööde arv: ");
            String öödeArvSisend = sisend.readLine(); // Küsime mitu ööd soovib klient meil olla.

            // Kasutaja võib ükskõik mida sisestada niikaua kuni saame kätte õige sisendi.
            try{
                int prooviInteger = Integer.parseInt(öödeArvSisend);
                if (prooviInteger > 0){
                    öödeArv.add(öödeArvSisend);
                    vastus.add(öödeArv);
                    break;
                }
            }
            catch (NumberFormatException ex){

            }
        }

        System.out.println();
        System.out.println();

        // Klient valis VIP toa, kuhu kuulub kõik paketid.
        if (valitudKlass.get(0).equals("2"))
            return vastus;

        List<String> paketiSoovid = new ArrayList<>();
        while (true){
            if (valitudKlass.get(0).equals("1")){
                System.out.println(" ________________________________________________________________________ ");
                System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
                System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
                System.out.println("|                       Kas soovite mõnda lisapaketti?                   |");
                System.out.println("|                                                                        |");
                System.out.println("|                   Paketi lisamiseks valige vastav number               |");
                System.out.println("|                                                                        |");
                System.out.println("|     1 - Jõusaal      2 - Bassein        3 - Saun      4 - Õhtusöök     |");
                System.out.println("|                                                                        |");
                System.out.println("|                   Broneeringu esitamiseks sisestage: x                 |");
                System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
            }
            System.out.println("                       Hetkel valitud lisapaketid: " + paketiSoovid);
            System.out.print("                               Sisesta toiming: ");

            String paketiNumber = (sisend.readLine()); // Kusime pakette

            // Klient on broneeringu esitanud!
            if (paketiNumber.equals("x"))
                break;

            else if ((paketiNumber.equals("1") || paketiNumber.equals("2") || paketiNumber.equals("3") || paketiNumber.equals("4")) && !paketiSoovid.contains(paketiNumber))
                paketiSoovid.add(paketiNumber);
        }

        vastus.add(paketiSoovid);
        System.out.println(vastus); // Hiljem kustutamiseks.
        return vastus;
    }

    public void kuvaBroneering(String toaNumber, String hotelliNimi, String hotelliAadress, double hindKokku){
        System.out.println(" ________________________________________________________________________ ");
        System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
        System.out.println("|                                                                        |");
        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("|                Hea Klient, sinu broneering on vastu võetud!            |");
        System.out.println("|                                                                        |");
        System.out.println("|-----------------------------BRONEERINGU ANDMED-------------------------|");
        System.out.println("|                                                                        |");
        System.out.println("                           1. Hotelli nimi: " + hotelliNimi);
        System.out.println("                           2. Toa number: " + toaNumber);
        System.out.println("                           3. Hotelli aadress: " + hotelliAadress);
        System.out.println("                           4. Hind kokku: " + hindKokku + " €");
        System.out.println("|                                                                        |");
        System.out.println("|-----------------------------BRONEERINGU ANDMED-------------------------|");

    }

    public void puuduvadToad(){
        System.out.println(" ________________________________________________________________________ ");
        System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("|                                                                        |");
        System.out.println("|            Hea Klient, kahjuks me ei leidnud ühtegi vaba tuba.         |");
        System.out.println("|                                                                        |");
        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
    }

}