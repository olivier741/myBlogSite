package com.hak.utils;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * @author hak
 * @description
 * @date 2020/8/14
 */
public class CommonUtil {

   public static String creatUUID(){
       return UUID.randomUUID().toString().replace("-","");
   }
}
