package Tugas2;

class Segitiga {
    int alas;
    int tinggi;

    Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int luasSegitiga() {
        int luas = (alas * tinggi) / 2;
        System.out.println(luas);
        return luas;
    }
}
