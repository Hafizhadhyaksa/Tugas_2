package Tugas2;
import java.util.Scanner;
public class MenghitungLuas {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input==1) {
            Persegi persegi = new Persegi(sc.nextInt());
            persegi.luasPersegi();
        } else if(input==2) {
            Segitiga segitiga = new Segitiga(sc.nextInt(), sc.nextInt());
            segitiga.luasSegitiga();
        } else if(input==3) {
            int in = sc.nextInt();
            Lingkaran lingkaran = new Lingkaran(in);
            if (in % 7 == 0) {
                lingkaran.luasLingkaranA();
            } else {
                lingkaran.luasLingkaranB();
            }
        } else{
            System.out.print("Input yang anda masukan tidak sesuai \n");
        }

    }
}
