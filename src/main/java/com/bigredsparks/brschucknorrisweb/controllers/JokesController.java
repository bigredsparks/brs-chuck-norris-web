package com.bigredsparks.brschucknorrisweb.controllers;

import com.bigredsparks.brschucknorrisweb.services.ChuckNorrisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private ChuckNorrisService chuckNorrisService;

    public JokesController(ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", chuckNorrisService.getJoke());
        return "chucknorris";
    }

}
