package com.juaracoding.utils;

public enum TestCases {

    T1("User dapat berhasil login dengan menggunakan kredensial yang valid"),
    T2("User dapat berhasil menambahkan produk yang diinginkan ke dalam keranjang");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
