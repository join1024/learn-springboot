package com.learn.springboot.utils;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonUtils {
    public static String arrayToString(String[] arrays){
        if(arrays==null){
            return null;
        }
        return Stream.of(arrays).collect(Collectors.joining(","));
    }
}
