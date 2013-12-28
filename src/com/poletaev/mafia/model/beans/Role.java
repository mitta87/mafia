/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poletaev.mafia.model.beans;


public enum Role {
    MAFIA("Мафия"),
    COMISSAR("Комиссар"),
    SERGEANT("Сержант"),
    DOCTOR("Доктор"),
    COURTESAN("Куртизанка"),
    MANIAC("Маньяк"),
    HOHOL("Хохол"),
    CIVIL("Мирный житель");

    private String name;

    public String getName() {
        return name;
    }

private Role(String name) {
        this.name = name;
    }  
}
