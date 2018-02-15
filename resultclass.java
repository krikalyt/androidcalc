package com.example.krishna.calculator;

/**
 * Created by KRISHNA on 2/14/2018.
 */

public class resultclass {
    static int firstnumber;
    static int lastnumber;
    static int result;
    static float fisrstfloat;
    static float lastfloat;
    static float resultfloat;
    public static float operation(float strone,float strtwo, char dooperation){
        if (dooperation == '+') {
            resultfloat = strone + strtwo;
        } else if (dooperation == '-') {
            resultfloat = strone - strtwo;
        } else if (dooperation == '*') {
            resultfloat = strone * strtwo;
        } else if (dooperation == '/') {
            resultfloat = strone / strtwo;
        } else {
            resultfloat = 0;
        }
        return resultfloat;
    }
    public static int operation(int strone,int strtwo,char dooperation){
        if (dooperation == '+') {
            result = strone + strtwo;
        } else if (dooperation == '-') {
            result = strone - strtwo;
        } else if (dooperation == '*') {
            result = strone * strtwo;
        } else if (dooperation == '/') {
            result = strone / strtwo;
        } else {
            result = 0;
        }
        return result;
    }
    public static float operation(float strone,int strtwo, char dooperation){
        if (dooperation == '+') {
            resultfloat = strone + strtwo;
        } else if (dooperation == '-') {
            resultfloat = strone - strtwo;
        } else if (dooperation == '*') {
            resultfloat = strone * strtwo;
        } else if (dooperation == '/') {
            resultfloat = strone / strtwo;
        } else {
            resultfloat = 0;
        }
        return resultfloat;
    }
    public static float operation(int strone,float strtwo,char dooperation){
        if (dooperation == '+') {
            resultfloat = strone + strtwo;
        } else if (dooperation == '-') {
            resultfloat = strone - strtwo;
        } else if (dooperation == '*') {
            resultfloat = strone * strtwo;
        } else if (dooperation == '/') {
            resultfloat = strone / strtwo;
        } else {
            resultfloat = 0;
        }
        return resultfloat;
    }


}


