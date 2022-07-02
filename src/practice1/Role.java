/*
 * @Author: Bittere_Gift 329056266@qq.com
 * @Date: 2022-07-03 02:05:16
 * @LastEditors: Bittere_Gift 329056266@qq.com
 * @LastEditTime: 2022-07-03 02:39:54
 * @FilePath: \practice\src\practice1\Role.java
 * @Description: 
 * 
 * Copyright (c) 2022 by Bittere_Gift 329056266@qq.com, All Rights Reserved. 
 */
package practice1;

/*
 * 人物抽象类
 */
public abstract class Role {

    protected int HP;
    protected double money;

    protected Role(int HP, double money) {
        this.HP = HP;
        this.money = money;
    }

    public int getHP() {
        return HP;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "HP=" + HP + ",Money=" + money;
    }

    /**
     * 增加（减少）具体数量的钱
     * @param money 增加（减少为负）钱的数量
     */
    public void addMoney(int money) {
        this.money += money;
    }

    /**
     * 金钱翻倍（减倍）
     * @param index 翻倍倍数（减倍为小于1）
     */
    public void multiplyMoney(double index) {
        money *= index;
    }

    /**
     * 增加（减少）具体数量的生命值
     * @param money 增加（减少为负）生命值
     */
    public void addHP(int HP) {
        this.HP += HP;
    }

    /**
     * 生命值翻倍（减倍）
     * @param index 生命值翻倍倍数（减倍为小于1）
     */
    public void multiplyHP(double index) {
        HP *= index;
    }

    public abstract void open(Box box);
}
