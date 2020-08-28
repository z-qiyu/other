package project1;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class module_table1 extends JFrame{
	
	JLabel l1 = new JLabel("00:00:00");
	JButton b1 = new JButton("按钮1");
	
	
	public module_table1(String title) {
		super(title);
		Container c = getContentPane();
		GridBagLayout gbl = new GridBagLayout();
		c.setLayout(gbl);
		
		gbl.columnWidths = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		gbl.rowHeights = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		gbl.columnWeights = new double[] {0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,
				0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125};
		gbl.rowWeights = new double[] {0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,
				0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125,0.03125};	
		
		int x ;
		int y ;
		
		Color o = Color.red;
        
        for(x=6;x<12;x++) {
        	y=3;
        	GridBagConstraints gbc = new GridBagConstraints();
        	JPanel n = new JPanel();
        	n.setBackground(o);
            gbc.fill = GridBagConstraints.BOTH;
            gbc.gridx = x;
            gbc.gridy = y;
            add(n, gbc);
        }
        
        for(x=20;x<26;x++) {
        	y=3;
        	GridBagConstraints gbc = new GridBagConstraints();
        	JPanel n = new JPanel();
        	n.setBackground(o);
            gbc.fill = GridBagConstraints.BOTH;
            gbc.gridx = x;
            gbc.gridy = y;
            add(n, gbc);
        }
		
        for(x=5;x<14;x++) {
        	y=4;
        	GridBagConstraints gbc = new GridBagConstraints();
        	JPanel n = new JPanel();
        	n.setBackground(o);
            gbc.fill = GridBagConstraints.BOTH;
            gbc.gridx = x;
            gbc.gridy = y;
            add(n, gbc);
        }
        for(x=18;x<27;x++) {
        	y=4;
        	GridBagConstraints gbc = new GridBagConstraints();
        	JPanel n = new JPanel();
        	n.setBackground(o);
            gbc.fill = GridBagConstraints.BOTH;
            gbc.gridx = x;
            gbc.gridy = y;
            add(n, gbc);
        }

        for(x=4;x<28;x++) {
        	y=5;
        	GridBagConstraints gbc = new GridBagConstraints();
        	JPanel n = new JPanel();
        	n.setBackground(o);
            gbc.fill = GridBagConstraints.BOTH;
            gbc.gridx = x;
            gbc.gridy = y;
            add(n, gbc);
        }
        
        for(x=4;x<28;x++) {
        	y=6;
        	GridBagConstraints gbc = new GridBagConstraints();
        	JPanel n = new JPanel();
        	n.setBackground(o);
            gbc.fill = GridBagConstraints.BOTH;
            gbc.gridx = x;
            gbc.gridy = y;
            add(n, gbc);
        }
        int p;
        for(int k=4;k<16;k++) {
            for(p=7, x=k;x<16;x++,p++) {
            	y=p;
            	GridBagConstraints gbc = new GridBagConstraints();
            	JPanel n = new JPanel();
            	n.setBackground(o);
                gbc.fill = GridBagConstraints.BOTH;
                gbc.gridx = x;
                gbc.gridy = y;
                add(n, gbc);
            }
        }
        for(int m=27;m>15;m--) {
        	for(p=7, x=m;x>15;x--,p++) {
            	y=p;
            	GridBagConstraints gbc = new GridBagConstraints();
            	JPanel n = new JPanel();
            	n.setBackground(o);
                gbc.fill = GridBagConstraints.BOTH;
                gbc.gridx = x;
                gbc.gridy = y;
                add(n, gbc);
            }
        }
        
        
	}
}
