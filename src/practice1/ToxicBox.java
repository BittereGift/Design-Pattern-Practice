/*
 * @Author: Bittere_Gift 329056266@qq.com
 * @Date: 2022-07-03 02:50:37
 * @LastEditors: Bittere_Gift 329056266@qq.com
 * @LastEditTime: 2022-07-03 03:03:19
 * @FilePath: \practice\src\practice1\ToxicBox.java
 * @Description: 
 * 
 * Copyright (c) 2022 by Bittere_Gift 329056266@qq.com, All Rights Reserved. 
 */
package practice1;

public class ToxicBox extends Box {

    protected ToxicBox() {
        super(0);
    }

    @Override
    public void open(Role role) {
        if (role instanceof Soldier) {
            role.multiplyHP(0.9);
            role.multiplyMoney(1.2);
        } else if (role instanceof Mage) {
            role.multiplyHP(0.7);
            role.multiplyMoney(1.4);
        } else {
            role.open(this); //如果角色不能在这里处理打开箱子，则在这个角色的open位置寻找打开这个箱子的方法
        }
    }
    
}
