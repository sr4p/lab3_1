import javax.swing.*;

public class Main {
    public static void main(String[] sr) {

        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.ERROR_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"eiei","OH", JOptionPane.YES_NO_OPTION);

        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null," aa");
        }

        else {
            JOptionPane.showMessageDialog(null,"ff");
        }
    }
}
