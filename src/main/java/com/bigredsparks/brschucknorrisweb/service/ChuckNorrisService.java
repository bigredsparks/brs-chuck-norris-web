package com.bigredsparks.brschucknorrisweb.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorrisService {

    public String getJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
