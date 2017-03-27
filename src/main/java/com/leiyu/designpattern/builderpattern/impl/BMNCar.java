package com.leiyu.designpattern.builderpattern.impl;

import com.leiyu.designpattern.builderpattern.AbstractCar;

/**
 * Created by wh on 2017/3/8.
 */
public class BMNCar extends AbstractCar {
    public void run() {
        System.out.println("this is BMN Car,the engine is " + this.getEngine() + ",use " + this.getTires().size() + " tires,"
        + " has " + this.getDoors().size() + "doors");
    }
}
