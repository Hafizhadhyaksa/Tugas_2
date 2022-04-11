package Tugas2;

class Lingkaran {
    int jari2;

    Lingkaran(int jari2) {
        this.jari2 = jari2;

    }

    public int luasLingkaranB() {
        int luas = (int) (3.14 * jari2 * jari2);
        System.out.println((double) luas);
        return luas;

    }

    public int luasLingkaranA() {
        int luas = (int) (22 / 7 * jari2 * jari2);
        System.out.println((double) luas);
        return luas;

    }

}
