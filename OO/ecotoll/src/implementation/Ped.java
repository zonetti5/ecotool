package implementation;

import Interfaccia.*;
import classi_veicoli.*;
import classe_casello.*;


public class Ped implements InterfacciaPedaggio {
	
	public double Calcolo ( Veicoli p, Casello l, Casello h) {
		
		int x, y;
		double z;	
		double ris;
		double iva = 0.22;
		x=l.getKm(); // distanza casello 
		y=h.getKm(); // distanza casello
		z=p.getTariffa(); // tariffa classe veicolo
		
		ris = z*(Math.abs(x-y));//distanza in km
		ris = ris + (ris*iva);
		ris = Math.round(ris*10)/100;
		return ris;
	}
}
