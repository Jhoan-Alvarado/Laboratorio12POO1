import javax.swing.JOptionPane;

public class Proceso {

	
	
	private double ladoA,ladoB;
	
	
	
	
	public void iniciar(){
		
		ingresaDatos();
		
	}




	private void ingresaDatos() {
		
		ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado A"));
		ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado B"));
		
		calcularArear ();
		
	}




	private void calcularArear() {
		double resultado= ladoA*ladoB;
		
		JOptionPane.showMessageDialog(null, "El resultado es : " + resultado);
		
	};
}
