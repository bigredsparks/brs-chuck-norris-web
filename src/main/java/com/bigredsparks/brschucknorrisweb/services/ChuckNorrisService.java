package com.bigredsparks.brschucknorrisweb.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisService {

    public String getJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
