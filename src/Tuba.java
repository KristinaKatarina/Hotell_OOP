public class Tuba {
    // Lisasin kampaania jaoks vajalikud meetodid,
    // kui on tarvis, siis võid neid muuta, aga anna mulle ka teada :))
    private String toaNumber;
    private boolean kasTubaKahele;
    private boolean kasVIP;
    private boolean kasTubaOnKinni;

    public Tuba(String toaNumber, boolean kasTubaKahele, boolean kasVIP, boolean kasTubaOnKinni) {
        this.toaNumber = toaNumber;
        this.kasTubaKahele = kasTubaKahele;
        this.kasVIP = kasVIP;
        this.kasTubaOnKinni = kasTubaOnKinni;
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
}
