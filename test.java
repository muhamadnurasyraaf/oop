import java.util.*;
import javax.swing.JOptionPane;
public class test{
    public static void main(String[] args) {
        LinkedList <Uitm> list = new LinkedList<>();
        Uitm s;
        
        JOptionPane.showMessageDialog(null,"Welcome to uitm!");
        for(int i = 0; i<2;i++){
            String id = JOptionPane.showInputDialog("Enter your id");
            String branch = JOptionPane.showInputDialog("Which branch are you?");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
            char input = JOptionPane.showInputDialog("Are you staff(Y) or Student(N)?").charAt(0);
            if(input == 'Y'){
                String staffCode = JOptionPane.showInputDialog("Enter your staff code");
                s = new Staff(id, branch, age, staffCode);
               list.add(s);
            }
            else{
                int semester = Integer.parseInt(JOptionPane.showInputDialog("Which semester currently?"));
                String courseCode = JOptionPane.showInputDialog("Enter your course code");
                s = new Student(id, branch, age, semester, courseCode);
                list.add(s);
            }
        }

        ListIterator li = list.listIterator();

        while(li.hasNext()){
            System.out.println(li.next().toString());
        }

        
    }
}