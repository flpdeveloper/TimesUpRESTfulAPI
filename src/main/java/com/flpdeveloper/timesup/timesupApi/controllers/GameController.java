package com.flpdeveloper.timesup.timesupApi.controllers;


import com.flpdeveloper.timesup.timesupApi.GameManager;
import com.flpdeveloper.timesup.timesupApi.models.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @GetMapping("/game/create")
    public void createGame(@RequestParam(value = "name", defaultValue = "World") String name) {
        if (GameManager.getInstance().addGame(Game.createGame())) {

        } else {
            //Return error, game with same UUID already in gamePool
        }
    }

    @GetMapping("/game/join")
    public void joinGame(@RequestParam(value = "gameUUID") String UUID,
                         @RequestParam(value = "team") String team) {


    }

}
