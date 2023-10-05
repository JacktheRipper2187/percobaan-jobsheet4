Algoritma: Harga_Bayar_22
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan harga barang}

Deklarasi:
harga, jumlah, jmlHalBuku  : int
diskon, total, bayar, jmlDiskon : double
merkBuku : String

Deskripsi:
1.print "=====Selamat datang di toko wahyudi=====”
2.print "Masukkan merek buku anda”
3.read merkBuku
4.print "Jumlah halaman buku"
5.read jmlHalBuku
6.print "Masukkan berapa banyak buku yang dibeli"
7.read jumlah
8.print "Masukkan harga buku anda"
9.read harga
10.print "Diskon yang anda dapatkan"
11.read diskon
12.total = harga * jumlah
13.jmlDiskon = total * diskon / 100
14.bayar = total - jmlDiskon
15.print "Merk buku"
16.print merkBuku
17.print "Jumlah halaman buku"
18.print jmlHalBuku
19.print "Jumlah yang anda beli"
20.print jumlah
21.print "Harga total sebelum diskon"
22.print total
23.print "Jumlah diskon yang anda dapatkan adalah"
24.print jmlDiskon
25.print "Total yang dibayar setelah diskon"
26.print bayar