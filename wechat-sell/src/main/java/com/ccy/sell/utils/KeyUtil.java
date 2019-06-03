package com.ccy.sell.utils;

import java.util.Random;

/**
 * @author CCY
 * @date 2019/6/3 14:29
 */
public class KeyUtil {
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
