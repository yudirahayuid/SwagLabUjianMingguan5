Feature: Proses User Login
  # 1
  Scenario: Sistem menangani skenario di mana user mencoba login dengan menggunakan kredensial yang salah
    Given User mengakses halaman login
    When User memasukan username yang valid
    And User memasukan password kosong yang invalid
    And User klik tombol login
    Then Sistem menampilkan pesan kesalahan Epic sadface: Password is required
  # 2
  Scenario: User dapat berhasil login dengan menggunakan kredensial yang valid
    And User memasukan password yang valid
    And User klik tombol login ke 2x nya
    Then User berhasil login dan diarahkan ke halaman utama atau dashboard setelah login
