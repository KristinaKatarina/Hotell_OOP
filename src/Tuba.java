abstract class Tuba {
    private String toaNumber;
    private boolean kasVIP;
    private boolean kasTubaOnKinni;
    private boolean kasTubaKahele;

    public Tuba(String toaNumber, boolean kasVIP, boolean kasTubaOnKinni, boolean kasTubaKahele) {
        this.toaNumber = toaNumber;
        this.kasVIP = kasVIP;
        this.kasTubaOnKinni = kasTubaOnKinni;
        this.kasTubaKahele = kasTubaKahele;
    }

    public String getToaNumber() {
        return toaNumber;
    }


    public boolean isKasVIP() {
        return kasVIP;
    }


    public boolean isKasTubaOnKinni() {
        return kasTubaOnKinni;
    }

    public void setKasTubaOnKinni(boolean kasTubaOnKinni) {
        this.kasTubaOnKinni = kasTubaOnKinni;
    }


    abstract double lisaPakettideHind();

    abstract double öödeHind();

    // tegin hindKokku avalikuks, sest see kood on TubaNeljale ja TubaKahele klassides ühine
    public double hindKokku() {
        // Hind kokku.
        return öödeHind() + lisaPakettideHind();
    }

}
