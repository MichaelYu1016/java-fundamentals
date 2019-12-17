package com.example.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Base64;

/**
 * AES加密解密工具类
 * @author ynx
 * @version V1.0
 * @date 2019-12-17
 * @modified_date 2019-12-17
 */
public class AesUtils {
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final String ALGORITHM = "AES";
    private static final String CHARSET = "utf-8";

    /**
     * 建议为16位或32位
     */
    private static final String KEY = "abcdef0123456789";
    /**
     * 必须16位
     * 初始化向量IV不可以为32位，否则异常java.security.InvalidAlgorithmParameterException: Wrong IV length: must be 16 bytes long
     */
    private static final String IV = "abcdef0123456789";

    /**
     * 加密
     *
     * @param context 原始文本
     * @return 加密后文本
     */
    public static String encrypt(String context) {
        try {
            byte[] decode = context.getBytes(CHARSET);
            byte[] bytes = cipherExecute(decode, Cipher.ENCRYPT_MODE);
            return Base64.getEncoder().encodeToString(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密
     *
     * @param context 已加密文本
     * @return 解密文本
     */
    public static String decrypt(String context) {
        try {
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] decode = decoder.decode(context);
            byte[] bytes = cipherExecute(decode, Cipher.DECRYPT_MODE);
            return new String(bytes, CHARSET);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据选择模式执行操作
     *
     * @param context 需要处理的文本
     * @param mode 模式（解码or加密）
     * @return 密文，byte类型
     * @throws Exception 异常
     */
    public static byte[] cipherExecute(byte[] context, int mode) throws Exception {
        byte[] key = KEY.getBytes(CHARSET);
        byte[] iv = IV.getBytes(CHARSET);
        Key secretKeySpec = new SecretKeySpec(key, ALGORITHM);
        AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(mode, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(context);
    }
}
