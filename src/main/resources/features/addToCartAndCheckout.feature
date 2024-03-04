Feature: User Menambahkan Produk
  # 1
  Scenario: User dapat berhasil menambahkan produk yang diinginkan ke dalam keranjang
    When User menambahkan produk ke keranjang
    And User melihat melihat produk dalam keranjang
    And User melakukan checkout
    And User menambahkan firstname yang valid
    And User menambahkan lastname yang valid
    And User menambahkan zip postal code yang valid
    And User klik tombol continue
    And User klik tombol finish
    Then User berhasil melakukan checkout
    And User kembali melihat barang lain

    # 2
  Scenario: User menambahkan produk ke 2x nya ke dalam keranjang
    When User menambahkan produk lagi ke keranjang
    And User melihat melihat produk dalam keranjang ke 2x nya
    And User melakukan checkout ke 2x nya
    And User klik tombol continue tanpa mengisi infomasi
    Then Sistem memberi tahu error jika tidak memberi informasi