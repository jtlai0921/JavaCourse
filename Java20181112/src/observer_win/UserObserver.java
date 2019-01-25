package observer_win;

import javax.swing.JTextField;

public class UserObserver implements IObserver {
    private String name;
    private Object view;
    public UserObserver(String name) {
        this.name = name;
    }

    public UserObserver(String name, Object view) {
        this.name = name;
        this.view = view;
    }
    
    @Override
    public void update(Object data) {
        System.out.println(name + " : " + data);
        if(view instanceof JTextField) {
            ((JTextField)view).setText(String.valueOf(data));
        }
    }
    
}
