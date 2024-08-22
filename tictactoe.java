import java.awt.*;
import java.awt.event.*;

public class tictactoe extends Frame implements ActionListener {
    // Declare variables and components here
    Button b[] = new Button[9];	//the array of buttons
    Button b1; // New game
    int k=0, x=8, y=28; //coordinates x and y
    int a = 0; // O and X
    int z=0, z1=0, z2=0, z3=0, z4=0, z5=0, z6=0, z7=0, z8=0; //declaring buttons

    public tictactoe() {
        setLayout(null);
        setVisible(true);
        setSize(800, 600);
        setLocation(400, 100);
        setBackground(Color.pink);
        setForeground(Color.white);
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                b[k] = new Button();
                b[k].setSize(100, 100);
                b[k].setLocation(x, y);
                b[k].setFont(new Font("", Font.BOLD, 40));
                
                add(b[k]);
                
                b[k].addActionListener(this);
                b[k].setBackground(new Color(255, 141, 28)); // ORANGE
                k++;
                x = x + 100;
            }
            
            x = 8; 
            y = y + 100;
        }
        
        b1 = new Button("New Game");
        b1.setSize(150, 40);
        b1.setLocation(500, 300);
        b1.setFont(new Font("", Font.BOLD, 20));
        b1.setForeground(Color.black);
        
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b[0] &&  z==0){
			
			if(a%2==0){
				b[0].setLabel("O"); z++; a++;
			}
			else{
				b[0].setLabel("X"); z++; a++;
			}
				
		}
		if(e.getSource()==b[1] &&  z1==0){
			
			if(a%2==0){
				b[1].setLabel("O"); z1++; a++;
			}
			else{
				b[1].setLabel("X"); z1++; a++;
			}
				
		}
		if(e.getSource()==b[2] &&  z2==0){
			
			if(a%2==0){
				b[2].setLabel("O"); z2++; a++;
			}
			else{
				b[2].setLabel("X"); z2++; a++;
			}
				
		}
		if(e.getSource()==b[3] &&  z3==0){
			
			if(a%2==0){
				b[3].setLabel("O"); z3++; a++;
			}
			else{
				b[3].setLabel("X"); z3++; a++;
			}
				
		}
		if(e.getSource()==b[4] &&  z4==0){
			
			if(a%2==0){
				b[4].setLabel("O"); z4++; a++;
			}
			else{
				b[4].setLabel("X"); z4++; a++;
			}
				
		}
		if(e.getSource()==b[5] &&  z5==0){
			
			if(a%2==0){
				b[5].setLabel("O"); z5++; a++;
			}
			else{
				b[5].setLabel("X"); z5++; a++;
			}
				
		}
		if(e.getSource()==b[6] &&  z6==0){
			
			if(a%2==0){
				b[6].setLabel("O"); z6++; a++;
			}
			else{
				b[6].setLabel("X"); z6++; a++;
			}
				
		}
		if(e.getSource()==b[7] &&  z7==0){
			
			if(a%2==0){
				b[7].setLabel("O"); z7++; a++;
			}
			else{
				b[7].setLabel("X"); z7++; a++;
			}
				
		}
		if(e.getSource()==b[8] &&  z8==0){
			
			if(a%2==0){
				b[8].setLabel("O"); z8++; a++;
			}
			else{
				b[8].setLabel("X"); z8++; a++;
			}
        }
		}

    public static void main(String ar[]) {
        new tictactoe();
    }
}
