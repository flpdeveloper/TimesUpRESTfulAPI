package com.flpdeveloper.timesup.timesupApi.models;

import com.flpdeveloper.timesup.timesupApi.utils.JSONUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Team {
    private String uuid = UUID.randomUUID().toString().replace("-", "");;
    private Map<String, Player> players = new HashMap();
    private int score;

    public boolean addPlayer(Player p) {
        if (!players.containsKey(p.getUuid())) {
            players.put(p.getUuid(), p);
            return true;
        }
        return false;
    }

    public static Team parse(String json) {
        return JSONUtils.jsonToClass(json, Team.class);
    }
}
