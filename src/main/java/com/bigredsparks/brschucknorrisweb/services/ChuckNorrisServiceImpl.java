package com.bigredsparks.brschucknorrisweb.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }

}
