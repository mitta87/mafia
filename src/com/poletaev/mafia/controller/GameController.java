/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poletaev.mafia.controller;

import com.poletaev.mafia.model.beans.Player;
import com.poletaev.mafia.model.beans.Role;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Митя
 */
public class GameController {

    private static GameController INSTANCE;
    private GameSettings settings;
    private Map<Integer, Player> players;

    private GameController() {
    }

    public static GameController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GameController();
        }
        return INSTANCE;
    }

    public GameSettings getSettings() {
        return settings;
    }

    public void setSettings(GameSettings settings) {
        this.settings = settings;
    }

    public void newGame(int numberOfPlayers, List<Role> activeRoles) {
        this.initGameSettings(numberOfPlayers, activeRoles);
        initPlayers();
    }

    public void initGameSettings(int numberOfPlayers, List<Role> activeRoles) {
        this.settings = new GameSettings();
        this.settings.setNumberOfPlayers(numberOfPlayers);
        this.settings.setRoleList(this.fillRoleList(activeRoles));
    }

    public List<Role> fillRoleList(List<Role> activeRoles) {
        List<Role> roles = new ArrayList<Role>();
        for (Role role : activeRoles) {
            roles.add(role);
        }
        for(int i = 0; i < this.settings.getNumberOfPlayers() - activeRoles.size(); i++){
        roles.add(Role.CIVIL);
        }
        return roles;
    }

    public void initPlayers() {
        players = new HashMap<Integer, Player>();
        Collections.shuffle(this.settings.getRoleList());
        for (int i = 0; i < settings.getNumberOfPlayers(); i++) {
            Player player = new Player(i + 1, this.settings.getRoleList().get(i));
            players.put(i + 1, player);
            System.out.println(player);
        }
    }
}
