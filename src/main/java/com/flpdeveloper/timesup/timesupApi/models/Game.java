package com.flpdeveloper.timesup.timesupApi.models;

import com.flpdeveloper.timesup.timesupApi.utils.DateUtils;
import com.flpdeveloper.timesup.timesupApi.utils.JSONUtils;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Game {

    private String uuid = UUID.randomUUID().toString().replace("-", "");
    private Team blueTeam;
    private Team redTeam;
    private List<Word> words;
    private Date startDate;
    private Date endDate;
    private Team winner;
    private boolean ended;
    public static final String DATE_FORMAT = "dd/MM/yyyy HH:mm";

    public static Game createGame() {
       Game game = new Game();
       game.blueTeam = new Team();
       game.redTeam = new Team();
       game.words = new ArrayList<>();
       game.startDate = DateUtils.getSQLDate(new java.util.Date());

       return game;
    }

    public static Game parse(String json) {
        return JSONUtils.jsonToClass(json, Game.class);
    }

    //GETTERS AND SETTERS

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public boolean isEnded() {
        return ended;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }

    public static String getDateFormat() {
        return DATE_FORMAT;
    }

    public Team getBlueTeam() {
        return blueTeam;
    }

    public void setBlueTeam(Team blueTeam) {
        this.blueTeam = blueTeam;
    }

    public Team getRedTeam() {
        return redTeam;
    }

    public void setRedTeam(Team redTeam) {
        this.redTeam = redTeam;
    }
}
