package com.example.css.fashionlib.dagger2;

import javax.inject.Inject;

/**
 * Created by css on 2018/5/5.
 */
public class JavaInject {
    @Inject
    Game game;
    public void show(){
        System.out.println(game.getName());
    }
}
