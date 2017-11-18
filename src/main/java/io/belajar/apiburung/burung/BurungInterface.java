package io.belajar.apiburung.burung;

public class BurungInterface {
    private String id;
    private String namaburung;
    private String keterangan;

    public BurungInterface() {

    }

    public BurungInterface(String id, String namaburung, String keterangan) {
        this.id = id;
        this.namaburung = namaburung;
        this.keterangan = keterangan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaburung() {
        return namaburung;
    }

    public void setNamaburung(String namaburung) {
        this.namaburung = namaburung;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
