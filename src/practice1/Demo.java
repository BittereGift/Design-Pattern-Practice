/*
 * @Author: Bittere_Gift 329056266@qq.com
 * @Date: 2022-07-03 02:56:39
 * @LastEditors: Bittere_Gift 329056266@qq.com
 * @LastEditTime: 2022-07-03 03:12:44
 * @FilePath: \practice\src\practice1\Demo.java
 * @Description: 
 * 
 * Copyright (c) 2022 by Bittere_Gift 329056266@qq.com, All Rights Reserved. 
 */
package practice1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("开宝箱游戏");
        System.out.println("************************************");
        
        Role p1 = new Soldier();
        Box b1 = new MoneyBox(100);
        System.out.println("Player1:" + p1);
        System.out.println("Box1:" + b1);

        System.out.println("**********************************");

        p1.open(b1);
        System.out.println("P1 open B1");
        System.out.println("Player1:" + p1);
        System.out.println("Box1:" + b1);

        System.out.println("*************************************");

        Box b2 = new ToxicBox();
        p1.open(b2);

        System.out.println("P1 open B2");
        System.out.println("Player1:" + p1);

        System.out.println("*************************************");
        
        Role p2 = new Mage();
        System.out.println("Player2:" + p2);
        p2.open(b2);

        System.out.println("p2 open box");
        System.out.println("Player2:" + p2);

        System.out.println("*************************************");

        Role p3 = new Shooter();
        System.out.println("Player3:" + p3);

        System.out.println("P3 open B2");
        p3.open(b2);
        System.out.println("Player3:" + p3);
    }
}
