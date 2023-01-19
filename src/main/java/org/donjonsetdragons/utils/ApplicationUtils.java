package org.donjonsetdragons.utils;

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
}
