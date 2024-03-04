package com.juaracoding.utils;

public enum TestCases {

    T1("User dapat berhasil login dengan menggunakan kredensial yang valid"),
    T2("Sistem menangani skenario di mana user mencoba login dengan menggunakan kredensial yang salah"),
    T3("User dapat berhasil menambahkan produk yang diinginkan ke dalam keranjang"),
    T4("User menambahkan produk ke 2x nya ke dalam keranjang");

    private String testCaseName;

    TestCases(String value) {
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
