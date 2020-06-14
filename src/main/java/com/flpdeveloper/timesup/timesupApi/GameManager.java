package com.flpdeveloper.timesup.timesupApi;

import com.flpdeveloper.timesup.timesupApi.models.Game;
import com.flpdeveloper.timesup.timesupApi.models.Player;

import java.util.HashMap;
import java.util.Map;

public class GameManager {

    private Map<String, Game> gamesMap = new HashMap<>();
    private static GameManager instance;

    public static GameManager getInstance() {
        if (instance == null) {
            return new GameManager();
        }
        return instance;
    }

    public boolean addGame(Game game) {
        if (!gamesMap.containsKey(game.getUuid())) {
            gamesMap.put(game.getUuid(), game);
            return true;
        }
        return false;
    }

    public void addPlayer(String gameUUID, String team) {
        //Create player with new Player UUID
        Player player = new Player();
        Game game = getGame(gameUUID);

        if (game != null) {
            if (team.equals("BLUE")){
                game.getBlueTeam().addPlayer(player);
            } else {
                game.getRedTeam().addPlayer(player);
            }
        }
    }

    public Game getGame(String gameUUID) {
        return gamesMap.get(gameUUID);
    }
}
