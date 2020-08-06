package academy.devdojo.springboot2.util;

import academy.devdojo.springboot2.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved(){
        return Anime.builder().name("Akuna Matata").url("http://akuna.com").build();
    }

    public static Anime createValidAnime(){
        return Anime.builder().name("Akuna Matata").url("http://akuna.com").id(1).build();
    }

    public static Anime createValidUpdatedAnime(){
        return Anime.builder().name("Akuna Matata Updated").url("http://akuna.com").id(1).build();
    }
}
