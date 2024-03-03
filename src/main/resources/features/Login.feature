Feature: Proses User Login
  # 1
  Scenario: User dapat berhasil login dengan menggunakan kredensial yang valid.
    Given User mengakses halaman login
    When User memasukan username yang valid
    And User memasukan password yang valid
    And User klik tombol login
    Then User berhasil login dan diarahkan ke halaman utama atau dashboard setelah login
