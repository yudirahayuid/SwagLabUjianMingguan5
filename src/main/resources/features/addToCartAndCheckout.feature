Feature: User Menambahkan Produk
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