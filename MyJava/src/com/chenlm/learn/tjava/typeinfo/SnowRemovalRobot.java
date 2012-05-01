package com.chenlm.learn.tjava.typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 下午11:35:01
 */
public class SnowRemovalRobot implements Robot {
    private String name;
    public SnowRemovalRobot(String name) { this.name = name; }
    public String name() { return name; }
    public String model() { return "SnowBot Series 11"; }
    public List<Operation> operations() {
        return Arrays.asList(
                new Operation() {
                    public String description() {
                        return name + " can shovel snow";
                    }
                    public void command() {
                        System.out.println(name + " shoveling snow");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can chip ice";
                    }
                    public void command() {
                        System.out.println(name + " chipping ice");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can clear the roof";
                    }
                    public void command() {
                        System.out.println(name + " clearing roof");
                    }
                }
                );
    }
    public static void main(String[] args) {
        Robot.Test.test(new SnowRemovalRobot("Slusher"));
    }
}
