package Tugas2;

class Persegi {
    int sisi;

    Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int luasPersegi() {
        int luas = sisi * sisi;
        System.out.println(luas);
        return luas;
    }
}
