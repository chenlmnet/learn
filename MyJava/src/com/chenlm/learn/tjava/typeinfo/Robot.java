package com.chenlm.learn.tjava.typeinfo;

import java.util.List;

import com.chenlm.learn.tjava.util.Null;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 下午11:31:28
 */
public interface Robot {
    String name();
    String model();
    List<Operation> operations();
    class Test {
        public static void test(Robot r) {
            if (r instanceof Null) {
                System.out.println("[Null Robot]");
            }
            System.out.println("Robot name: " + r.name());
            System.out.println("Robot model: " + r.model());
            for (Operation operation : r.operations()) {
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
