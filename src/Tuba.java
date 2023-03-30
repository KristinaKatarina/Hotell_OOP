import java.util.List;

abstract class Tuba {
    private String hotell;
    private String toaNumber;
    private boolean kasVIP;
    private boolean kasTubaOnKinni;

    public Tuba(String hotell,String toaNumber, boolean kasVIP, boolean kasTubaOnKinni) {
        this.hotell = hotell;
        this.toaNumber = toaNumber;
        this.kasVIP = kasVIP;
        this.kasTubaOnKinni = kasTubaOnKinni;
    }

    public String getHotell() {
        return hotell;
    }

    public String getToaNumber() {
        return toaNumber;
    }

    public boolean isKasVIP() {
        // Meetod tagastab true kui tegemist on VIP toaga.
        // Vastasel juhul false.
        return kasVIP;
    }

    public boolean isKasTubaOnKinni() {
        return kasTubaOnKinni;
    }

    public void setKasTubaOnKinni(boolean kasTubaOnKinni) {
        this.kasTubaOnKinni = kasTubaOnKinni;
    }
    abstract void setÖödeArv(int öödeArv);
    abstract void setPaketid(List<String> paketid);

    abstract double lisaPakettideHind();

    abstract double öödeHind();

    abstract List<String> pakettideNimed();
    abstract double VipToaHind();


    public double hindKokku() {
        // Hind kokku.
        return öödeHind() + lisaPakettideHind();
    }

    public String toString() {
        if (!isKasVIP()) {
            return "Broneerisite toa number: " + this.getToaNumber()
                    +", pakettidega: " + pakettideNimed() + ", hotellis: " + getHotell()
                    + "\n" + "Broneeringu koguhind on: " + hindKokku() + " eurot";
        }
        return "Broneerisite VIP toa number: " + this.getToaNumber() + ", hotellis: " + getHotell()
                + "\n" + "Broneeringu koguhind on: " + this.VipToaHind() + " eurot";
    }


}
