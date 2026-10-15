# Katalon SauceLabs Mobile Automation

Proyek otomatisasi pengujian aplikasi mobile (*Mobile App Testing*) untuk aplikasi **Swag Labs (Sauce Labs)** menggunakan Katalon Studio dan Appium.

## 📱 Target Application
- **Aplikasi:** Swag Labs (Android APK)
- **File APK:** `androidapp/APK-sauce-labs.2.7.1.apk` (yang disimpan secara lokal di dalam proyek dengan *androidapp*).

---

## 📋 1. Project Description & Test Coverage
Proyek ini dirancang untuk memvalidasi fungsionalitas inti aplikasi *e-commerce mobile* secara otomatis, mencakup skenario positif dan negatif tanpa menggunakan fitur *Record Mobile* (seluruh objek dibangun manual).

Memuat **3 skenario utama**:
1. **TC_Mobile_Login_Positive_001 (Positive)**: Memverifikasi pengguna dengan kredensial valid (`standard_user`) dapat berhasil masuk ke halaman katalog produk utama.
2. **TC_Mobile_Login_Negative_002 (Negative)**: Memverifikasi sistem menolak akses dan memunculkan pesan error yang sesuai saat pengguna terkunci (*locked_out_user*) mencoba masuk tanpa password.
3. **TC_Mobile_AddToCart_Positive_003 (Positive)**: Memverifikasi alur lengkap mulai dari login sukses, navigasi ke halaman detail produk, memvalidasi deskripsi produk, melakukan *scroll*, hingga berhasil menambahkan produk ke dalam keranjang belanja (*cart*).

---

## ⚙️ 2. Test Suite Execution Flow
Seluruh skenario pengujian dikelompokkan ke dalam satu Test Suite utama:
- **Test Suite:** `TS_Mobile_SauceLabs`
- **Alur Eksekusi:** Berjalan secara berurutan (*sequential*) di atas Android Emulator menggunakan driver Appium.

---

## 🚀 3. How to Run (Cara Menjalankan)

1. **Prasyarat:**
   - Pastikan **Android Studio** ter-install dan siapkan 1 buah **Android Emulator** (Virtual Device).
   - Pastikan **Node.js** dan **Appium** sudah ter-install di komputer Anda.
2. **Clone Repository:**
   ```bash
   git clone [https://github.com/lamsiharsiahaan/katalon-saucelabs-mobile.git](https://github.com/lamsiharsiahaan/katalon-saucelabs-mobile.git)
