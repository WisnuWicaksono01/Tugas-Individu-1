#include <iostream>
using namespace std;

int main() {
    // Variabel
    int angka = 5;
    float pecahan = 3.14;
    string teks = "Hello, world!";

    // For loop
    for (int i = 1; i <= angka; i++) {
        cout << "Iterasi ke-" << i << endl;
    }

    // If statement
    if (angka > 0) {
        cout << "Angka positif" << endl;
    } else if (angka < 0) {
        cout << "Angka negatif" << endl;
    } else {
        cout << "Angka nol" << endl;
    }

    // While loop
    int j = 0;
    while (j < angka) {
        cout << "Iterasi while ke-" << j << endl;
        j++;
    }

    // Do-While loop
    int k = 0;
    do {
        cout << "Iterasi do-while ke-" << k << endl;
        k++;
    } while (k < angka);

    // Array satu dimensi
    int arrSatuDimensi[] = {1, 2, 3, 4, 5};

    // Array multidimensi
    int arrMultiDimensi[2][3] = {{1, 2, 3}, {4, 5, 6}};

    // Input
    int inputAngka;
    cout << "Masukkan sebuah angka: ";
    cin >> inputAngka;
    cout << "Anda memasukkan: " << inputAngka << endl;

    // Output
    cout << "Nilai dari angka adalah: " << angka << endl;
    cout << "Nilai dari pecahan adalah: " << pecahan << endl;
    cout << "Teks: " << teks << endl;

    // Comment
    // Ini adalah contoh komentar dalam C++
    
    return 0;
}