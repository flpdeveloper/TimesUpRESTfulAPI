package com.flpdeveloper.timesup.timesupApi.models;

import com.flpdeveloper.timesup.timesupApi.utils.JSONUtils;
import org.springframework.web.socket.WebSocketSession;

import java.util.UUID;


public class Player  {

    private String uuid = UUID.randomUUID().toString().replace("-", "");
    private WebSocketSession webSocketSession;
    private String name;

    public static Player parse(String json) {
        return JSONUtils.jsonToClass(json, Player.class);
    }


    //SETTERS & GETTERS


    public String getUuid() {
        return uuid;
    }

    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public WebSocketSession getWebSocketSession() {
        return webSocketSession;
    }

    public void setWebSocketSession(WebSocketSession webSocketSession) {
        this.webSocketSession = webSocketSession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
