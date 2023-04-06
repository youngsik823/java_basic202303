package day09.song;

import day04.array.StringList;

public class Test {

    public static void main(String[] args) {

        ArtistRepository ar = new ArtistRepository();
//        ar.addFirstArtist("아이유", "분홍신");
//        ar.addFirstArtist("동방신기", "wrong number");

        ArtistRepository.artistList[0].info();
        ArtistRepository.artistList[1].info();

        ar.addNewSong("아이유", "좋은날");


    }
}
