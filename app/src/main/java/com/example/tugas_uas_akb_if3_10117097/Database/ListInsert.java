package com.example.tugas_uas_akb_if3_10117097.Database;

import android.content.Context;

/** NIM : 10117097
 * Nama : Imam Jati Permana
 * Kelas : IF-3
 * Tanggal : 09-08-2020**/

public class ListInsert {

    private static DatabaseHelper databaseHelper;

    public ListInsert(Context context){

        databaseHelper = new DatabaseHelper(context);
  //      Log.d("insert", "inserting data");
        databaseHelper.save(new TourPlace(1, "Situ Cisanti",
                "Tarumajaya, Kertasari, Bandung, Jawa Barat",
                "24 Jam",
                "Situ Cisanti merupakan hulu sungai Citarum. " +
                        "Siapa sangka, hulu sungai yang membelah Bandung ini ternyata indah sekali lho. " +
                        "Suasananya masih alami, Buat penggemar wisata alam pasti akan betah.",
                "https://www.nativeindonesia.com/wp-content/uploads/2017/11/tempat-duduk-di-sekitar-situ-cisanti.jpg",
                "-7.2088735", "107.6528399"));

        databaseHelper.save(new TourPlace(2, "Maribaya",
                "Kampung Cikondang Lamajang Pangalengan, Cibodas, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                "24 Jam",
                "Maribaya sekarang sudah berbeda dengan Maribaya yang dulu. Dibawah management yang baru, " +
                        "tempat ini direnovasi dan berubah nama menjadi Maribaya resort and spa. " +
                        "Terletak tidak jauh dari pusat kota Lembang, cocok sekali buat anda kunjungi.",
                "https://www.nativeindonesia.com/wp-content/uploads/2017/11/Sky-bridge-maribaya-bandung.jpg",
                "-6.8278591", "107.6366598"));

        databaseHelper.save(new TourPlace(3, "Tebing Keraton",
                "Ciburial, Kec. Cimenyan, Kabupaten Bandung Barat, Jawa Barat",
                "24 Jam",
                "Tebing keraton bandung merupakan tempat wisata yang baru dikenal akhir-akhir ini. " +
                        "tempat ini dikenal awalnya dari media sosial ," +
                        "hingga akhirnya berkembang jadi tempat wisata alam yang unik.",
                "https://nativeindonesia.com/wp-content/uploads/2014/09/Tebing-keraton-bukit-keraton.jpg",
                "-6.8340682", "107.6548818"));

        databaseHelper.save(new TourPlace(4, "Curug Tilu Leuwi Opat",
                "Jl. Kp. Ciwangun Indah Camp, Cihanjuang Rahayu, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat",
                "24 Jam",
                "Mau trekking ringan di Lembang? anda bisa berkunjung ke curug tilu leuwi opat. " +
                        "Untuk jalur trekingnya tergolong santai dan ringan, jalur setapak dengan pijakan tanah,  " +
                        "terus sesekali kita bakal melewati jembatan kayu, irigasi air, pokoknya enak.",
                "https://2.bp.blogspot.com/-iQ0rwKnkzSI/XKwzkN7VNRI/AAAAAAAAHIo/BBlVk_FmzcMsKxECHq46tTl0ILUxsILjQCLcBGAs/s1600/cover.jpg",
                "-6.790573", "107.582628"));

        databaseHelper.save(new TourPlace(5, "Gunung Tangkuban Perahu",
                "Cikahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                "24 Jam",
                "Gunung Tangkuban Perahu merupakan salah satu situs wisata terkenal di Indonesia. " +
                        "Tempat wisata ini memang memiliki jarak yang cukup jauh dari pusat kota Bandung, " +
                        "namun gunung yang bentuknya menyerupai perahu terbalik ini selalu padat pengunjung.",
                "https://www.wisataidn.com/wp-content/uploads/2020/07/Gunung-Tangkuban-Perahu-1.jpg",
                "-6.7596372", "107.5922711"));


    }



}
