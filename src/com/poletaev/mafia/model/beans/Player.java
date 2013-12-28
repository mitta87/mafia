/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poletaev.mafia.model.beans;

/**
 *
 * @author Митя
 */
public class Player {

    private int number;
    private Role role;

    public Player(int number, Role role) {
        this.number = number;
        this.role = role;
    }

    public Player() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Player{" + "number=" + number + ", role=" + role + '}';
    }

  

}
