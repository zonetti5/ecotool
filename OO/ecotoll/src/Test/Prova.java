package Test;
import classe_casello.*;
import classi_veicoli.*;
//import Exception.ExcAltezza;
import implementation.*;
//import Interfaccia.*;


public class Prova {

	public static void main(String[] args){
		
		Veicoli J = new ClasseA("toyota", "supra", 1990, "bn123ac", 200, 1.12);
		Casello X = new Casello(300, "Roma");
		Casello Y = new Casello(150, "Popoli"); 
		Ped P = new Ped();
		
		double risultato;
		risultato = P.Calcolo(J, X, Y);
		
		Casello[] autostrada= new Casello[3];
		autostrada[0]= new Casello(200,"Roma");
		autostrada[1]=new Casello( 150, "Popoli");
		risultato= P.Calcolo(J, autostrada[0], autostrada[1]);
		
		}

}
