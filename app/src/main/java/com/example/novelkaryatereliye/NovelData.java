package com.example.novelkaryatereliye;

import java.util.ArrayList;

public class NovelData {
    private static String [] novelName = {
            "Bumi",
            "Bulan",
            "Matahari",
            "Bintang",
            "Ceros & Batozar",
            "Komet",
            "Komet Minor",
            "Selena",
            "Nebula",
            "Si Putih",
            "Lumpu",
            "Bibi Gill",
            "Sagaras",
            "Hujan",
            "Pulang",
            "Pergi",
            "Tentang Kamu",
            "Rindu",
            "Si Anak Kuat",
            "Si Anak Spesial",
            "Si Anak Pintar",
            "Si Anak Pemberani"

    };

    private static String [] novelDetail = {
            "Bumi adalah novel pertama Tere Liye dari Serial Bumi yang terbit tahun 2014",
            "Bulan adalah novel kedua Tere Liye dari Serial Bumi yang terbit tahun 2015",
            "Matahari adalah novel ketiga Tere Liye dari Serial Bumi yang terbit tahun 2016",
            "Bintang adalah novel keempat Tere Liye dari Serial Bumi yang terbit tahun 2017",
            "Ceros & Batozar adalah novel kelima Tere Liye dari Serial Bumi yang terbit tahun 2018",
            "Komet adalah novel keenam Tere Liye dari Serial Bumi yang terbit tahun 2018",
            "Komet Minor adalah novel ketujuh Tere Liye dari Serial Bumi yang terbit tahun 2019",
            "Selena adalah novel kedelapan Tere Liye dari Serial Bumi yang terbit tahun 2020",
            "Nebula adalah novel kesembilan Tere Liye dari Serial Bumi yang terbit tahun 2020",
            "Si Putih adalah novel kesepuluh Tere Liye dari Serial Bumi yang terbit tahun 2021",
            "Lumpu adalah novel kesebelas Tere Liye dari Serial Bumi yang terbit tahun 2021",
            "Bibi Gill adalah novel kedua belas Tere Liye dari Serial Bumi yang terbit tahun 2022",
            "Sagaras adalah novel ketiga belas Tere Liye dari Serial Bumi yang terbit tahun 2022",
            "Hujan adalah novel karya Tere Liye tentang melupakan yang terbit pada tahun 2016",
            "Pulang adalah novel karya Tere Liye yang terbit pada tahun 2015",
            "Pergi adalah novel karya Tere Liye yang terbit pada tahun 2018",
            "Tentang Kamu adalah novel perjalanan hidup karya Tere Liye yang terbit pada tahun 2016",
            "Rindu adalah novel tentang perjalanan sebuah kerinduan karya Tere Liye yang terbit pada tahun 2014",
            "Si Anak Kuat adalah novel urutan pertama dari karya Tere Liye serial Si Anak Nusantara yang terbit pada tahun 2018",
            "Si Anak Spesial adalah novel kedua karya Tere Liye serial Si Anak Nusantara yang terbit pada tahun 2018",
            "Si Anak Pintar adalah novel ketiga karya Tere Liye serial Si Anak Nusantara yang terbit pada tahun 2018",
            "Si Anak Pemberani adalah novel keempat karya Tere Liye serial Si Anak Nusantara yang terbit pada tahun 2018"

    };

    private static int [] novelImage = {
            R.drawable.bumi,
            R.drawable.bulan,
            R.drawable.matahari,
            R.drawable.bintang,
            R.drawable.ceroz,
            R.drawable.komet,
            R.drawable.komet_minor,
            R.drawable.selena,
            R.drawable.nebula,
            R.drawable.si_putih,
            R.drawable.lumpu,
            R.drawable.bibi_gill,
            R.drawable.sagaras,
            R.drawable.hujan,
            R.drawable.pulang,
            R.drawable.pergi,
            R.drawable.tentang_kamu,
            R.drawable.rindu,
            R.drawable.si_anak_kuat,
            R.drawable.si_anak_spesial,
            R.drawable.si_anak_pintar,
            R.drawable.si_anak_pemberani

    };

    static ArrayList<Novel> getListData(){
        ArrayList<Novel> list = new ArrayList<>();
        for (int position = 0; position <novelName.length; position++) {
            Novel novel = new Novel();
            novel.setName(novelName[position]);
            novel.setDetail(novelDetail[position]);
            novel.setPhoto(novelImage[position]);
            list.add(novel);
        }
        return list;
    }
}
