/*
 * @Author: Bittere_Gift 329056266@qq.com
 * @Date: 2022-07-03 02:41:01
 * @LastEditors: Bittere_Gift 329056266@qq.com
 * @LastEditTime: 2022-07-03 02:49:20
 * @FilePath: \practice\src\practice1\Mage.java
 * @Description: 
 * 
 * Copyright (c) 2022 by Bittere_Gift 329056266@qq.com, All Rights Reserved. 
 */
package practice1;

public class Mage extends Role {
    
    public Mage() {
        super(200, 50);
    }

    @Override
    public void open(Box box) {
        box.open(this);      
    }
}
