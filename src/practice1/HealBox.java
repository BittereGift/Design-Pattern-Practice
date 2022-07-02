/*
 * @Author: Bittere_Gift 329056266@qq.com
 * @Date: 2022-07-03 03:05:57
 * @LastEditors: Bittere_Gift 329056266@qq.com
 * @LastEditTime: 2022-07-03 03:06:07
 * @FilePath: \practice\src\practice1\HealBox.java
 * @Description: 
 * 
 * Copyright (c) 2022 by Bittere_Gift 329056266@qq.com, All Rights Reserved. 
 */
package practice1;

public class HealBox extends Box {

    protected HealBox() {
        super(0);
    }

    @Override
    protected void open(Role role) {
        //任何新加的箱子必须把所有的已有的角色的所有可能全部包括
        if (role instanceof Soldier) {
            role.addHP(50);
        } else if (role instanceof Mage) {
            if (role.money >= 10) {
                role.addHP(20);
                role.addMoney(-10);
            } else {
                role.addHP(-20);
            }
        } else if (role instanceof Shooter) {
            role.addHP(30);
            role.addMoney(40);
        } else {
            role.open(this); //如果这个角色是新加的，那么在那个角色里寻找代码
        }       
    }
    
}
