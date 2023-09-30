public class Main {
    public static void main(String[] args) {
        // Variabel
        int angka = 5;
        float pecahan = 3.14f;
        String teks = "Hello, world!";

        // For loop
        for (int i = 1; i <= angka; i++) {
            System.out.println("Iterasi ke-" + i);
        }

        // If statement
        if (angka > 0) {
            System.out.println("Angka positif");
        } else if (angka < 0) {
            System.out.println("Angka negatif");
        } else {
            System.out.println("Angka nol");
        }

        // While loop
        int j = 0;
        while (j < angka) {
            System.out.println("Iterasi while ke-" + j);
            j++;
        }

        // Do-While loop
        int k = 0;
        do {
            System.out.println("Iterasi do-while ke-" + k);
            k++;
        } while (k < angka);

        // Array satu dimensi
        int[] arrSatuDimensi = {1, 2, 3, 4, 5};

        // Array multidimensi
        int[][] arrMultiDimensi = {{1, 2, 3}, {4, 5, 6}};

        // Input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int inputAngka = scanner.nextInt();
        System.out.println("Anda memasukkan: " + inputAngka);

        // Output
        System.out.println("Nilai dari angka adalah: " + angka);
        System.out.println("Nilai dari pecahan adalah: " + pecahan);
        System.out.println("Teks: " + teks);

        // Comment
        // Ini adalah contoh komentar dalam Java
    }
}
