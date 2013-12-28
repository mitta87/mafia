/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.poletaev.mafia;

import com.poletaev.mafia.controller.GameController;
import com.poletaev.mafia.model.beans.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Митя
 */
public class Mafia {
    public static void main(String[] args) {
        GameController controller = GameController.getInstance();
        List<Role> list = new ArrayList<Role>();
        for(int i = 0; i < 3; i++){
            list.add(Role.MAFIA);
        }
        controller.newGame(11, list);
    }
}
