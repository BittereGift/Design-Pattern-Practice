/*
 * @Author: Bittere_Gift 329056266@qq.com
 * @Date: 2022-07-03 02:44:54
 * @LastEditors: Bittere_Gift 329056266@qq.com
 * @LastEditTime: 2022-07-03 02:48:53
 * @FilePath: \practice\src\practice1\MoneyBox.java
 * @Description: 
 * 
 * Copyright (c) 2022 by Bittere_Gift 329056266@qq.com, All Rights Reserved. 
 */
package practice1;

public class MoneyBox extends Box {

    protected MoneyBox(int money) {
        super(money);
    }

    @Override
    protected void open(Role role) {
        role.addMoney(money);
        removeMoney();
    }
    
}
