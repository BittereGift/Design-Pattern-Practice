/*
 * @Author: Bittere_Gift 329056266@qq.com
 * @Date: 2022-07-03 03:02:34
 * @LastEditors: Bittere_Gift 329056266@qq.com
 * @LastEditTime: 2022-07-03 03:13:21
 * @FilePath: \practice\src\practice1\Shooter.java
 * @Description: 
 * 
 * Copyright (c) 2022 by Bittere_Gift 329056266@qq.com, All Rights Reserved. 
 */
package practice1;

public class Shooter extends Role {

    protected Shooter() {
        super(100, 200);
    }

    @Override
    public void open(Box box) {
        //任何新加的角色必须把所有的已有的箱子的所有可能全部包括
        if (box instanceof ToxicBox) {
            addHP(20);
            multiplyMoney(0.9);
        } else {
            box.open(this); //如果这个箱子是新加的，那么在那个箱子里寻找代码
        }
    }
    
}
