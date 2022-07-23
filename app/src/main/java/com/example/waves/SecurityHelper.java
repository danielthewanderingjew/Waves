package com.example.waves;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SecurityHelper {

    private static String secret = "1234567890123456";
    private static SecretKey key =  new SecretKeySpec(secret.getBytes(), "AES");

    public static String Encrypt(String plain) {
        try {
            Cipher cipher = null;
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] cipherText = cipher.doFinal(plain.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(cipherText);
        } catch (Exception e){
            return "";
        }

    }

    public static String Decrypt(String encrypted) {
        try {
            byte[] decodedValue = Base64.getDecoder().decode(encrypted);
            Cipher cipher = null;
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            String decryptString = new String(cipher.doFinal(decodedValue), "UTF-8");
            return decryptString;
        } catch (Exception e){
            return "";
        }
    }

}

//To finish this - go to Class 23 recording min 45 and continue from there
