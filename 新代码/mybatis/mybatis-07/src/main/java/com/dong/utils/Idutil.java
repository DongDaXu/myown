package com.dong.utils;


import org.junit.jupiter.api.Test;

import java.util.UUID;

public class Idutil {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(Idutil.getId());
    }
}
