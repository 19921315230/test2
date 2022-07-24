package com.example.project1.controller;

public class Test {


    public static void main(String[] args) {


        pinjie();



    }


    /**
     * 拼接字符串
     */
    public static void pinjie(){
        int [] strs = {1,3,5,2,4};

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            stringBuffer.append(strs[i]);
        }
        System.out.println(stringBuffer);
    }



}
