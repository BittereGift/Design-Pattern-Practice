<!--
 * @Author: Bittere_Gift 329056266@qq.com
 * @Date: 2022-07-03 01:42:02
 * @LastEditors: Bittere_Gift 329056266@qq.com
 * @LastEditTime: 2022-07-03 02:09:58
 * @FilePath: \practice\src\practice1\detail.md
 * @Description: https://blog.csdn.net/qq_37386833/article/details/100919779
 * 
 * Copyright (c) 2022 by Bittere_Gift 329056266@qq.com, All Rights Reserved. 
-->
# Detail

一个开宝箱游戏的基本描述为:游戏中有多种类型的人物(Role)，如战士(Solider)、魔法师(Mage)等，主角的类型只能选择其中一种，且游戏中不再更改。
游戏中还有各种宝箱(Box)，如装有不同数目金钱的宝箱、装有毒物的宝箱等。
当任一种类型的主角打开装有金钱的宝箱时，宝箱中的金钱会增加给主角，同时宝箱的金钱数目变成0；
当战士打开装有毒物的宝箱时，战士的生命值(HP)会减少10%，但金钱(Money)增加20%；
当魔法师打开装有毒物的宝箱时，魔法师的生命值(HP)会减少30%，但金钱(Money)增加40% 。
请根据上述描述，给出相应类的设计并完整实现，要求你的设计应具有良好的扩展性，如增加新角色类型及箱子种类时，不需要修改已有的设计及实现。
