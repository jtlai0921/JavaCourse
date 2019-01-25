package des;

public class Test {
    public static void main(String[] args) throws Exception {
        DES des = new DES("src/des/user.key");
        String msg = "1111";
        System.out.println("明文是:" + msg);
        
        byte[] encontent = des.encrytor(msg); // 加密
        System.out.println("加密後:" + new String(encontent));
        
        byte[] decontent = des.decryptor(encontent); // 解密
        System.out.println("解密後:" + new String(decontent));
    }
}
