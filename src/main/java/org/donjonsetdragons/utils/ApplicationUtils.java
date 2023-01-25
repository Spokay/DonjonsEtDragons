package org.donjonsetdragons.utils;

import org.donjonsetdragons.Models.character_package.hero.Hero;

import java.lang.reflect.Constructor;

public class ApplicationUtils {

    public static String pluralize(int number, String singular, String plural){
        String res = number == 1 ? singular : plural;
        return res;
    }
    public static String pluralize(int number, String singular){
        String plural = singular + "s";
        String res = number == 1 ? singular : plural;
        return res;
    }
    public static Object getInstanceForName(String[] params) throws Exception {
        Class className = Class.forName(params[0]);
        Constructor classConstructor = className.getConstructor(String.class);
        return classConstructor.newInstance(params[1]);
    }
}
