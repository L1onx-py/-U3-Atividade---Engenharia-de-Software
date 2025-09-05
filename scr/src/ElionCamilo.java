import java.util.Objects;

public class ElionCamilo {

    private String Aura;
    private String Ego;
    private String Based;

    public ElionCamilo(String aura, String ego, String based) {
        Aura = aura;
        Ego = ego;
        Based = based;
    }

    public String getAura() {
        return Aura;
    }

    public void setAura(String aura) {
        Aura = aura;
    }

    public String getEgo() {
        return Ego;
    }

    public void setEgo(String ego) {
        Ego = ego;
    }

    public String getBased() {
        return Based;
    }

    public void setBased(String based) {
        Based = based;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElionCamilo that = (ElionCamilo) o;
        return Objects.equals(Aura, that.Aura) && Objects.equals(Ego, that.Ego) && Objects.equals(Based, that.Based);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Aura, Ego, Based);
    }

    @Override
    public String toString() {
        return "ElionCamilo{" +
                "Aura='" + Aura + '\'' +
                ", Ego='" + Ego + '\'' +
                ", Based='" + Based + '\'' +
                '}';
    }
}
