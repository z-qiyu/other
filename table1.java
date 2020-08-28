package project1;

import javax.swing.JFrame;

public class table1 {

	public table1() {
		
		module_table1 mt1 = new module_table1("不得了的程序");
		mt1.setSize(800, 800);
		mt1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mt1.setVisible(true);
		
	}
	public static void main(String[] args) {
		new table1();
	}

}
