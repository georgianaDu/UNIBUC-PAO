package clase;

public class ExceptionClassExample {
    private String mesaj;

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public String toString() {
        return "ExceptionClassExample{" +
                "mesaj='" + mesaj + '\'' +
                '}';
    }
}
