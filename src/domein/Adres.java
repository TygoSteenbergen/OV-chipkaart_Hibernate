package domein;

import javax.persistence.*;

@Entity
@Table(name = "adres", schema = "public")
public class Adres {
    @Id
    @Column(name = "adres_id")
    private int id;
    private String huisnummer;
    private String straat;
    private String woonplaats;
    private String postcode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reiziger_id", referencedColumnName = "reiziger_id")
    private Reiziger reiziger;

    public Adres(int id, String huisnummer, String straat, String woonplaats, Reiziger reiziger, String postcode) {
        this.id = id;
        this.huisnummer = huisnummer;
        this.straat = straat;
        this.woonplaats = woonplaats;
        this.reiziger = reiziger;
        this.postcode = postcode;
    }

    public Adres(){}

    public int getId() {
        return id;
    }

    public Reiziger getReiziger() {
        return reiziger;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    @Override
    public String toString() {
        return "Domain.d.Adres{" +
                "id=" + id +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
