class lingkaran extends bidangDuaDimensi {
    protected int jari;

    public lingkaran(String nama, int jari) {
        super(nama);
        this.jari = jari;
    }

    public void luas() {
        System.out.println("Luas lingkaran : " + (3.14 * jari * jari));
    }
}