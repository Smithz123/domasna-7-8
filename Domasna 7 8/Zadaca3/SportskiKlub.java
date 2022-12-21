public class SportskiKlub {

    private String imeNaKlub;
    private String sport;
    private int clenovi;

    public String getImeNaKlub() {
        return imeNaKlub;
    }

    public void setImeNaKlub(String imeNaKlub) {
        this.imeNaKlub = imeNaKlub;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getClenovi() {
        return clenovi;
    }

    public void setClenovi(int clenovi) {
        this.clenovi = clenovi;
    }

    public SportskiKlub(String imeNaKlub, String sport, int clenovi) {
        this.imeNaKlub = imeNaKlub;
        this.sport = sport;
        this.clenovi = clenovi;
    }

}