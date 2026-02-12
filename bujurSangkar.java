class bujurSangkar extends bidangDuaDimensi {
    protected int sisi;

    public bujurSangkar(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }

    public void luas() {
        System.out.println("Luas bujur sangkar : " + (sisi * sisi));
    }

}