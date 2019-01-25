package lab39;

public class AssertionDemo {
    public static void main(String[] args) {
        String[] ids = {"A123456789", "A323456789", "A223456789"};
        
        // 先檢查
        
        for(String id : ids) {
            switch(id.charAt(1)) {
                case '1':
                    System.out.println(id + " 男性");
                    break;
                case '2':
                    System.out.println(id + " 女性");
                    break;    
                default:
                    assert(false):"ID 錯誤, " + id;
            }
        }
        
        
    }
}
