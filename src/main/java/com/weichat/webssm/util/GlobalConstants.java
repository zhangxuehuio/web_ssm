package com.weichat.webssm.util;

import java.util.Properties;

public class GlobalConstants {

    public static Properties interfaceUrlProperties;

    /**
     * @param @param  key
     * @param @return
     * @Description: TODO
     * @author dapengniao
     * @date 2015 年 10 月 13 日 下午 4:59:14
     */
    public static String getInterfaceUrl(String key) {
        return (String) interfaceUrlProperties.get(key);
    }

}