package com.d2c.common.base.utils.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.d2c.common.base.exception.BaseException;

/**
 * SHA 哈希算法工具
 * @author wull
 */
public class SHAUt {

    /**
     * SHA256
     */
    public static byte[] sha256(byte[] bytes) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bytes);
        } catch (NoSuchAlgorithmException e) {
            throw new BaseException(e);
        }
    }
    
}
