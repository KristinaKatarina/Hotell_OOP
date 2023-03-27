import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true)
            new Kasutajaliides().kysiKliendilt(); // Siin vajalik > throws IOException
        new TubaKahele("1", false, true, 5, List.of("1, 2, 3"));


    }


}