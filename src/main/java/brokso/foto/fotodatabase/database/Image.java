package brokso.foto.fotodatabase.database;

import javax.persistence.*;

@Entity
public class Image  {

    @Id @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="checksum")
    private String checksum;

    @Column(name="sti")
    private String sti;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getSti() {
        return sti;
    }

    public void setSti(String sti) {
        this.sti = sti;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", checksum='" + checksum + '\'' +
                ", sti='" + sti + '\'' +
                '}';
    }
}
