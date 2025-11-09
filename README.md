<h1>INHERITANCE</h1>
<h5>Inheritance adalah konsep dalam Pemrograman Berorientasi Objek (PBO / OOP) di mana suatu kelas (class anak/subclass) dapat mewarisi sifat dan perilaku (atribut dan method) 
  dari kelas lain (class induk/superclass). Dengan inheritance, kita bisa menghindari duplikasi kode dan memperluas fungsionalitas dari kelas yang sudah ada.</h5>

<h2>1.1 PACKAGE = LATIHAN 1</h3>
<h3>1.1.1 Class Car.java</h2>
<pre><img width="431" height="116" alt="image" src="https://github.com/user-attachments/assets/92c43723-529d-4a22-bdc2-b96fa90ff249" /></pre>
<h5>Kelas Car merupakan subclass dari Vehicle yang menggunakan konsep inheritance. Kelas ini mewarisi semua atribut dan method dari Vehicle, tetapi melakukan overriding pada method start(). 
  Di dalamnya terdapat perintah System.out.println("Mobil menyla dengan kunci kotak"); yang menunjukkan bahwa cara menyalakan mobil berbeda dari kendaraan lain. Jadi, saat objek Car memanggil 
  method start(), pesan tersebut akan ditampilkan menggantikan versi milik kelas induk.</h5>

<h2>1.1.2 Class Motorcycle</h2>
<pre><img width="443" height="122" alt="image" src="https://github.com/user-attachments/assets/3a3b1824-8e6b-4191-8eae-8edaf10b223d" /></pre>
<h5>Kelas Motorcycle merupakan subclass dari Vehicle yang menggunakan konsep inheritance. Kelas ini mewarisi semua atribut dan method dari kelas induk, 
  namun melakukan overriding pada method start(). Di dalamnya terdapat perintah System.out.println("Motor menyala dengan stater elektrik"); yang menampilkan cara menyalakan motor. 
  Dengan begitu, saat objek Motorcycle memanggil method start(), program akan menjalankan versi method yang ada di kelas ini, bukan yang ada di Vehicle.</h5>

<h2>1.1.3 Class Vahicle</h2>
<pre><img width="396" height="127" alt="image" src="https://github.com/user-attachments/assets/7470552b-a2d8-4602-a734-d3af3ee1e190" /></pre>
h5>Kelas Vehicle berperan sebagai superclass atau kelas induk yang dapat diwarisi oleh kelas lain. Di dalamnya terdapat atribut brand untuk menyimpan merek kendaraan,
serta method start() yang menampilkan pesan "Vehicle starts". Method ini nantinya bisa digunakan langsung oleh kelas turunan atau di-override agar memiliki perilaku berbeda sesuai jenis kendaraan. Kelas Main berfungsi sebagai kelas utama untuk menjalankan program. 
Di dalamnya dibuat array vehicles yang berisi dua objek, yaitu Car dan Motorcycle, yang keduanya merupakan turunan dari Vehicle. Melalui perulangan for, 
program memanggil method start() untuk setiap objek. Karena masing-masing kelas (Car dan Motorcycle) melakukan overriding pada method start(),
maka output yang muncul menyesuaikan dengan jenis objeknya. Hal ini menunjukkan penerapan polymorphism dalam konsep inheritance.

<h3>1.1.4 Class Main </h3>
<pre><img width="366" height="214" alt="image" src="https://github.com/user-attachments/assets/f3597382-eb18-4595-86da-d63d1a241c03" /></pre>
<h5>Kelas Main berfungsi sebagai kelas utama untuk menjalankan program. Di dalamnya dibuat array vehicles yang berisi dua objek, yaitu Car dan Motorcycle, yang keduanya merupakan turunan dari Vehicle. 
  Melalui perulangan for, program memanggil method start() untuk setiap objek. Karena masing-masing kelas (Car dan Motorcycle) melakukan overriding pada method start(), maka output yang muncul menyesuaikan dengan jenis objeknya.
  Hal ini menunjukkan penerapan polymorphism dalam konsep inheritance.</h5>
<h3> OUTPUT Latihan 1 </h3>
<pre><img width="296" height="74" alt="image" src="https://github.com/user-attachments/assets/7818ac91-03a2-47c2-a68e-12b579bfb806" />
</pre>

<h2>1.2 PACKAGE LATIHAN 2</h2>
<h3>1.2.1 Class Account</h3>
<pre><img width="479" height="206" alt="image" src="https://github.com/user-attachments/assets/9ecbaef6-77e6-43cd-8880-4bd2382489d5" /></pre>
<h5>Kelas Account berfungsi sebagai superclass atau kelas induk yang menyimpan data dasar tentang rekening. Kelas ini memiliki dua atribut, yaitu accNo untuk menyimpan nomor rekening dan balance untuk saldo. 
  Konstruktor digunakan untuk menginisialisasi kedua atribut tersebut saat objek dibuat. Method displayInfo() menampilkan informasi rekening berupa nomor dan saldo. Kelas ini nantinya dapat diwarisi oleh kelas lain, 
  seperti SavingsAccount atau CheckingAccount, untuk menambahkan fitur khusus pada jenis rekening tertentu.</h5>

<h3>1.2.2 Class CheckingAccount</h3>
<pre><img width="671" height="214" alt="image" src="https://github.com/user-attachments/assets/c240b39f-f84e-4e5a-849e-8f25e42c2c4e" /></pre>
<h5> Kelas CheckingAccount merupakan subclass dari Account yang menambahkan fitur khusus berupa overdraft limit (batas saldo negatif yang diizinkan). Kelas ini memanggil konstruktor super(accNo, balance) 
  untuk menginisialisasi atribut dari kelas induk, lalu menambahkan inisialisasi overdraftLimit. Method displayInfo() di-override untuk menampilkan informasi rekening giro yang mencakup nomor rekening, saldo, dan batas overdraft. 
  Dengan demikian, kelas ini memperluas fungsi Account agar sesuai dengan jenis rekening giro </h5>

<h3> Class SavingsAccount</h3>
<pre><img width="671" height="287" alt="image" src="https://github.com/user-attachments/assets/5c2df0b7-ed33-4c48-81f5-6704813b816c" /></pre>
<h5>Kelas SavingsAccount merupakan subclass dari Account yang menambahkan fitur bunga tabungan (interest rate). Konstruktor kelas ini memanggil konstruktor super(accNo, balance) dari kelas induk untuk menginisialisasi nomor rekening dan saldo,
  lalu menambahkan atribut interestRate. Method addInterest() digunakan untuk menambahkan bunga ke saldo berdasarkan suku bunga yang ditentukan. Selain itu, method displayInfo() di-override untuk menampilkan informasi rekening tabungan yang mencakup nomor rekening,
  saldo, dan tingkat bunga. Kelas ini menunjukkan penerapan inheritance sekaligus method overriding dalam konteks rekening tabungan.</h5>

<h3>Class Main</h3>
<pre><img width="401" height="368" alt="image" src="https://github.com/user-attachments/assets/6258e403-e779-4272-9be9-896d069dcf3c" /></pre>
<h5>Kelas Main berfungsi sebagai kelas utama untuk menjalankan program. Di dalamnya dibuat array accounts yang berisi objek dari dua jenis akun, yaitu SavingsAccount dan CheckingAccount, yang semuanya merupakan turunan dari kelas Account. Melalui perulangan for, setiap objek akun akan memanggil method displayInfo() sesuai jenisnya — ini menunjukkan penerapan polymorphism karena method yang sama menampilkan hasil berbeda. Selain itu, program memeriksa apakah objek termasuk SavingsAccount menggunakan instanceof. Jika iya, objek tersebut dikonversi (casting) agar bisa memanggil method khusus addInterest() untuk menambahkan bunga ke saldo. Program ini menggambarkan penerapan inheritance, overriding, dan polymorphism dalam sistem rekening bank sederhana.</h5>

<h3> OUTPUT Latihan 2</h3>
<PRE><img width="480" height="191" alt="image" src="https://github.com/user-attachments/assets/fb359bc1-5fac-4ac0-a48f-3bd9c914ef4d" />
</PRE>



<h2>1.3 PACKAGE LATIHAN 3</h2>

<h3> 1.3.1 Class Circle </h3>
<pre><img width="275" height="197" alt="image" src="https://github.com/user-attachments/assets/d5916f3b-56fb-4674-b212-9e124000a5d2" /></pre>
<h5>Kelas Circle merupakan subclass dari Shape yang merepresentasikan bentuk lingkaran. Kelas ini memiliki atribut radius untuk menyimpan jari-jari lingkaran. Konstruktor digunakan untuk menginisialisasi nilai jari-jari saat objek dibuat. Method area() di-override dari kelas induk Shape untuk menghitung dan mengembalikan luas lingkaran dengan rumus π × r². Kelas ini menunjukkan penerapan inheritance dan method overriding untuk menyesuaikan perhitungan luas sesuai jenis bentuk.</h5>

<h3> 1.3.2 Class  Rectangle </h3>
<pre><img width="337" height="221" alt="image" src="https://github.com/user-attachments/assets/4c55eec2-01e9-4280-a059-5a052317a09e" /></pre>
<h5> Kelas Rectangle merupakan subclass dari Shape yang merepresentasikan bentuk persegi panjang. Kelas ini memiliki dua atribut, yaitu width (lebar) dan height (tinggi), yang diinisialisasi melalui konstruktor. Method area() di-override dari kelas induk untuk menghitung luas persegi panjang dengan rumus lebar × tinggi. Kelas ini menunjukkan penerapan inheritance dan method overriding untuk menyesuaikan perhitungan luas sesuai bentuknya.</h5>

<h3>1.3.3 Class Shape</h3>
<pre><img width="413" height="102" alt="image" src="https://github.com/user-attachments/assets/d548ab02-42fc-4d09-86cb-d55cfef384e8" /></pre>
<h5>Kelas Shape merupakan kelas abstrak (abstract class) yang menjadi superclass bagi berbagai bentuk geometri. Di dalamnya terdapat satu method abstrak area() yang tidak memiliki isi, sehingga wajib di-override oleh setiap subclass. Kelas ini berfungsi sebagai kerangka dasar untuk bentuk-bentuk lain seperti Circle dan Rectangle, agar masing-masing dapat mendefinisikan cara menghitung luas sesuai karakteristiknya.</h5>

<h3> 1.3.4 Class Triangle</h3>
<pre><img width="324" height="218" alt="image" src="https://github.com/user-attachments/assets/9103d424-3779-46c7-8a4a-9d3b2d6998b1" /></pre>
<h5>Kelas Triangle merupakan subclass dari Shape yang merepresentasikan bentuk segitiga. Kelas ini memiliki dua atribut, yaitu base (alas) dan height (tinggi), yang diinisialisasi melalui konstruktor. Method area() di-override dari kelas induk untuk menghitung luas segitiga dengan rumus 0.5 × alas × tinggi. Kelas ini memperlihatkan penerapan inheritance dan method overriding untuk menghitung luas sesuai bentuk geometri yang diwakilinya.</h5>

<h3> 1.3.5 Class Main</h3>
<pre><img width="484" height="316" alt="image" src="https://github.com/user-attachments/assets/17206b0e-7fab-4962-9b3e-84afad58ca14" /></pre>
<h5>Kelas Main pada paket Latihan3 berfungsi sebagai kelas utama untuk menjalankan program. Di dalamnya dibuat array shapes yang berisi objek dari tiga kelas turunan Shape, yaitu Triangle, Rectangle, dan Circle. Program kemudian melakukan perulangan untuk memanggil method area() pada setiap objek. Karena setiap subclass memiliki implementasi berbeda, hasil perhitungan luas disesuaikan dengan bentuknya. Nilai luas tiap objek ditampilkan, lalu dijumlahkan menjadi total luas semua bentuk. Program ini menunjukkan penerapan inheritance, abstract class, dan polymorphism dalam perhitungan luas berbagai bentuk geometri.</h5>
<h3> OUTPUT Latihan 3</h3>
<pre><img width="331" height="116" alt="image" src="https://github.com/user-attachments/assets/5fa8a31f-363c-4ff6-9a7b-83bcbff14f0b" />
</pre>


