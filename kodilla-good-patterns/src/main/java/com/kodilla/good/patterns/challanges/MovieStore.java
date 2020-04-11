package com.kodilla.good.patterns.challanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    //Wykorzystując poznane już Streamy wykonaj iterację po poniższej mapie tytułów i wyświetl wszystkie tytuły w jednym ciągu separując je wykrzyknikiem:
    public String showCollection(Map<String, List<String>> moviesSollection) {

        System.out.println("# elements: " + moviesSollection.size());
        String result = moviesSollection.entrySet().stream()
                .map(entry -> entry.getValue().get(1))
                .collect(Collectors.joining("!"));

        return result;
    }

    public static void main(String[] args) {
        MovieStore ms = new MovieStore();
        System.out.println(ms.showCollection(ms.getMovies()));
    }
}