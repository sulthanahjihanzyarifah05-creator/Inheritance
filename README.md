<h1>INHERITANCE</h1>
<h5>Inheritance adalah konsep dalam Pemrograman Berorientasi Objek (PBO / OOP) di mana suatu kelas (class anak/subclass) dapat mewarisi sifat dan perilaku (atribut dan method) 
  dari kelas lain (class induk/superclass). Dengan inheritance, kita bisa menghindari duplikasi kode dan memperluas fungsionalitas dari kelas yang sudah ada.</h5>

<h2>1.1 PACKAGE = LATIHAN 1</h3>
<h3>1.1.1Class Car.java</h2>
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

<h3>Class Main </h3>
<pre><img width="366" height="214" alt="image" src="https://github.com/user-attachments/assets/f3597382-eb18-4595-86da-d63d1a241c03" /></pre>
<h5>Kelas Main berfungsi sebagai kelas utama untuk menjalankan program. Di dalamnya dibuat array vehicles yang berisi dua objek, yaitu Car dan Motorcycle, yang keduanya merupakan turunan dari Vehicle. 
  Melalui perulangan for, program memanggil method start() untuk setiap objek. Karena masing-masing kelas (Car dan Motorcycle) melakukan overriding pada method start(), maka output yang muncul menyesuaikan dengan jenis objeknya.
  Hal ini menunjukkan penerapan polymorphism dalam konsep inheritance.</h5>

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
<h5>Kelas Main berfungsi sebagai kelas utama untuk menjalankan program. Di dalamnya dibuat array accounts yang berisi objek dari dua jenis akun, yaitu SavingsAccount dan CheckingAccount, yang semuanya merupakan turunan dari kelas Account. Melalui perulangan for,
  setiap objek akun akan memanggil method displayInfo() sesuai jenisnya — ini menunjukkan penerapan polymorphism karena method yang sama menampilkan hasil berbeda. Selain itu, program memeriksa apakah objek termasuk SavingsAccount menggunakan instanceof. Jika iya, objek tersebut 
  dikonversi (casting) agar bisa memanggil method khusus addInterest() untuk menambahkan bunga ke saldo. Program ini menggambarkan penerapan inheritance, overriding, dan polymorphism dalam sistem rekening bank sederhana.</h5>
