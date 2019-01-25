package des;
/*
DES演算法為密碼體制中的對稱密碼體制，又被成為美國數據加密標准，
是 1972 年美國 IBM 公司研制的對稱密碼體制加密演算法。 
明文按 64 位進行分組, 密鑰長 64 位，密鑰事實上是 56 位參與 DES 運算
（第 8、16、24、32、40、48、56、64 位是校驗位， 使得每個密鑰都有奇數個 1）
分組後的明文組和 56 位的密鑰按位替代或交換的方法形成密文組的加密方法。
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class DES implements java.io.Serializable {
    
    // KeyGenerator 提供對稱密鑰生成器的功能，支持各種演算法
    private KeyGenerator keygen;
    // SecretKey 負責保存對稱密鑰
    private SecretKey deskey;
    // Cipher 負責完成加密或解密工作
    private Cipher c;
    // 該字節數組負責保存加密的結果
    private byte[] cipherByte;
    
    public DES(String path)
            throws NoSuchAlgorithmException, NoSuchPaddingException {
        Security.addProvider(new com.sun.crypto.provider.SunJCE());
        // 實例化支持 DES 演算法的密鑰生成器(演算法名稱命名需按規定，否則拋出異常)
        keygen = KeyGenerator.getInstance("DES");
        
        try {
            File file = new File(path);
            System.out.println("user.key 存放路徑：" + file.getAbsolutePath());
            if(file.exists()){
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                deskey = (SecretKey)ois.readObject();
            } else {
                // 生成密鑰
                deskey = keygen.generateKey();
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(deskey);
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        // 生成 Cipher 物件,指定其支持的 DES 演算法
        c = Cipher.getInstance("DES");
    }

    /**
     * 對字符串加密
     *
     * @param str
     * @return
     * @throws InvalidKeyException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public byte[] encrytor(String str)
            throws InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException {
        // 根據密鑰，對 Cipher 物件進行初始化，ENCRYPT_MODE 表示加密模式
        c.init(Cipher.ENCRYPT_MODE, deskey);
        byte[] src = str.getBytes();
        // 加密，結果保存進 cipherByte
        cipherByte = c.doFinal(src);
        return cipherByte;
    }

    /**
     * 對字符串解密
     *
     * @param buff
     * @return
     * @throws InvalidKeyException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public byte[] decryptor(byte[] buff)
            throws InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException {
        // 根據密鑰，對 Cipher 物件進行初始化，DECRYPT_MODE 表示加密模式
        c.init(Cipher.DECRYPT_MODE, deskey);
        cipherByte = c.doFinal(buff);
        return cipherByte;
    }

}
