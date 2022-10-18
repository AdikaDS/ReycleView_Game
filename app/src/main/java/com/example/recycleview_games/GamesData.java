package com.example.recycleview_games;

import java.util.ArrayList;

public class GamesData {
    private static String [] namaGame = {
            "DOTA 2",
            "Valorant",
            "Smite",
            "Fortnite",
            "Overwatch 2"
    };

    private static String [] publisherGame = {
            "Valve Corporation",
            "Riot Games",
            "Tencent Games",
            "Epic Games",
            "Blizzard Entertainment"
    };

    private static String [] deskGame = {
            "Salah satu game PC gratis ringan dengan fanbase yang terhitung paling banyak dari dulu hingga sekarang. Dengan beragam E-sport yang selalu di selenggarakan di setiap tahunnya dan hadiah uang tunai yang terhitung fantastis.\n\n" +
                    "Tentunya, yang paling menarik dari itu semua adalah club yang di dominasi oleh para pemain pro yang di setiap permainannya membawa daya tarik tersendiri, di setiap pertandingan yang ada. Sang pengembang Valve yang di desain oleh sang kreator dari “Dota 1” Ice Frog tentu berhasil membangun itu semua dengan mengusung seri keduanya yang terhitung meledak di pasaran.\n\n" +
                    "Dengan mekanik permainan MOBA yang sudah tidak asing lagi. Tentunya, game ini juga memiliki daya tarik yang luar biasa, contohnya dari skin hero nya, yang terhitung sangat keren dengan beragam efek yang menyelimuti di setiap hero yang ada. Yang tentunya dapat mampu menggaet para gamer awam maupun gamer veteran untuk mencobanya kembali.\n\n",
            "Valorant dikembangkan oleh Riot Games, developer di balik game kondang, League of Legends (LOL). Valorant diumumkan dengan nama sandi Project A pada Oktober 2019 dan akan dirilis untuk Windows pada musim panas 2020.\n\n" +
                    "Valorant dapat memberikan kompetisi yang kuat [...] akan menarik melihat apakah game ini bisa sukses secara global, kata Louise Shorthouse, analis game di firma riset pasar Omdia berkomentar soal kemunculan Valorant.\n\n" +
                    "Mode utama game Valorant seperti CSGO yaitu ada tim yang menyerang dan sisanya bertahan. Tim penyerang memiliki bom yang harus ditanam di beberapa titik. Bom itu disebut Spike.\n\n",
            "Game MOBA dengan cita rasa mitologi dewa-dewi yang menjadi ujung tombak dalam pengambilan suatu tema tersebut. Dengan mekanisme permainan MOBA yang ditawarkan, dengan pengambilan sudut pandang prespektif yang berbeda dari game MOBA kebanyakan.\n\n" +
                    "SMITE, game MOBA yang dikembangkan oleh Hi-Rez Studios ini, justru mengambil sudut pandang thirdperson. Yang tentunya pengambilan sudut pandang ini, sangat jarang sekali ada dalam game MOBA kebanyakan.\n\n" +
                    "Dengan beragam item seperti game MOBA sesungguhnya, hingga beragam aksi dan skill para karakter yang di akusisi secara sempurna dengan pengambilan kontrol yang terhitung mudah. Tentunya dengan beragam reward dan skin yang menggoda di setiap permainannya berlangsung.\n\n",
            "Fortnite adalah salah satu game dengan genre yang telah dirilis sejak 2017. Game yang dikembangkan oleh Epic Games ini juga telah menjadi game yang dapat menarik perhatian para gamer dengan aksi tembak-tembakannya yang seru dan menegangkan.\n\n" +
                    "Sama dengan PUBG dan Free Fire, para pemain Fortnite juga akan diturunkan di sebuah pulau. Nantinya, para pemain dituntut untuk menjadi pemain terakhir yang bertahan hidup dengan bermodalkan senjata yang dapat ditemui di pulau.\n\n" +
                    "Meski begitu, Fortnite juga memiliki keunikan yang membedakan dengan game lain. Ada pun hal yang membedakan yaitu masing-masing karakter di game Fortnite dapat membuat sebuah bangunan sebagai alat perlindungan diri.\n\n",
            "Salah satu game besutan Blizzard, Overwatch 2, resmi mengumumkan perilisannya secara global. Seri ini merupakan pembaruan yang dihadirkan pihak Blizzard untuk membawa penyegaran.\n\n" +
                    "Salah satu game besutan Blizzard, Overwatch 2, resmi mengumumkan perilisannya secara global. Seri ini merupakan pembaruan yang dihadirkan pihak Blizzard untuk membawa penyegaran.\n\n" +
                    "Perilisan Overwatch 2 juga menandai penghentian server Overwatch pertama, tepatnya pada Senin (3/10) yang lalu. Sebagai tambahan, Overwatch 2 sudah resmi rilis di tanggal 4 Oktober, tergantung dari masing-masing waktu lokal negara."
    };

    private static int [] gambarGame = {
            R.drawable.dota2,
            R.drawable.valorant,
            R.drawable.smite,
            R.drawable.fortnite,
            R.drawable.overwatch2
    };

    static ArrayList<Game> getListData() {
        ArrayList<Game> list = new ArrayList<>();
        for (int position = 0; position < namaGame.length; position++) {
            Game game = new Game();
            game.setNamaGame(namaGame[position]);
            game.setPublisherGame(publisherGame[position]);
            game.setDeskGame(deskGame[position]);
            game.setGambarGame(gambarGame[position]);
            list.add(game);
        }
        return list;
    }
}
