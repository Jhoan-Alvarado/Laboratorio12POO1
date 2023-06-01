package numeros;

import javax.swing.JOptionPane;

public class Numeros {

int numer;
int i,neg=0,par=0;

public void entrada () {
	
	for (int i = 0; i < 5; i++) {
		
		numer = ingresaDatos("Digite el numero 1");
		
		if (numer % 2 == 0) {
			par ++;
		}
		
		if (numer<0) {
			neg++;
		}
		
	}
	
	JOptionPane.showMessageDialog(null, "El numero de numeros pares es :" + par + "\n Y el numero de numero negativos es : " + neg);
}

private int ingresaDatos(String string) {
	int valor = Integer.parseInt(JOptionPane.showInputDialog(string));
	return valor;
}
	
	
	
}
