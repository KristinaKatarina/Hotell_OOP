import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Kasutajaliides {

    public List<List> kysiKliendilt() throws IOException { // Tagastab List [valitudHotell, öödeArv, valitudKlass, [pakett1, pakett2, jne]]

        List<List> vastus = new ArrayList<>();
        BufferedReader sisend = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" ________________________________________________________________________ ");
        System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("| Millisele hotellile soovite tuba broneerida? (Sisestage vastav number) |");
        System.out.println("|                                                                        |");
        System.out.println("|    1 - Citybox Tallinn        2 - Hestia Hotel        3 - Go Hotel     |");
        System.out.println("|                                                                        |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

        System.out.print("                              Hotelli number: ");

        String valitudHotellSisend = sisend.readLine(); // Küsime hotelli.
        List<String> valitudHotell = new ArrayList<>();
        valitudHotell.add(valitudHotellSisend);
        vastus.add(valitudHotell);

        System.out.println();
        System.out.println();
        System.out.println(" ________________________________________________________________________ ");
        System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        if (valitudHotell.get(0).equals("1"))
            System.out.println("|                   Teretulemast hotelli Citybox Tallinn!                |");
        else if (valitudHotell.get(0).equals("2"))
            System.out.println("|                     Teretulemast hotelli Hestia Hotel!                 |");
        else if (valitudHotell.get(0).equals("3"))
            System.out.println("|                       Teretulemast hotelli Go Hotel!                   |");
        System.out.println("|                                                                        |");
        System.out.println("|      Valige mis suurusega tuba soovite (Sisestage vastav number)       |");
        System.out.println("|                                                                        |");
        System.out.println("|              1 - Tuba kahele               2 - Tuba neljale            |");
        System.out.println("|                                                                        |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.print("                                Toa suurus: ");

        String toaSuurusSisend = sisend.readLine(); // Küsime toa suurust.
        List<String> toaSuurus = new ArrayList<>();
        toaSuurus.add(toaSuurusSisend);
        vastus.add(toaSuurus);

        System.out.println();
        System.out.println();

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
        List<String> valitudKlass = new ArrayList<>();
        valitudKlass.add(valitudKlassSisend);
        vastus.add(valitudKlass);

        System.out.println();
        System.out.println();

        System.out.println(" ________________________________________________________________________ ");
        System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("|                      Mitu ööd soovite hotellis veeta?                  |");
        System.out.println("|                                                                        |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.print("                                  Ööde arv: ");

        String öödeArvSisend = sisend.readLine(); // Küsime mitu ööd soovib klient meil olla.
        List<String> öödeArv = new ArrayList<>();
        öödeArv.add(öödeArvSisend);
        vastus.add(öödeArv);

        List<String> paketiSoovid = new ArrayList<>();

        System.out.println();
        System.out.println();

        if (valitudKlass.get(0).equals("2"))
            return vastus;

        while (true){
            if (valitudKlass.get(0).equals("1")){
                System.out.println(" ________________________________________________________________________ ");
                System.out.println("|----------------------------HOTELLI BRONNER 1.0-------------------------|");
                System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
                System.out.println("|                       Kas soovite mõnda lisa paketti?                  |");
                System.out.println("|                                                                        |");
                System.out.println("|               1 -          2 -           3 -          4 -              |");
                System.out.println("|                                                                        |");
                System.out.println("|                         Edasi minemiseks sisestage: x                  |");
                System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
            }
            System.out.print("                                Paketi number: ");
            String paketiNumber = (sisend.readLine()); // Kusime pakette
            if (paketiNumber.equals("x"))
                break;
            paketiSoovid.add(paketiNumber);
        }

        vastus.add(paketiSoovid);
        System.out.println(vastus);
        return vastus;

    }

}
