package classi_veicoli;

import Exception.*;


public class ClasseB extends Veicoli {
	
	public ClasseB(String m, String mod, int an, String t, int p, double alt) throws ExcAltezza {
		
		this.marca = m;
		this.modello = mod;
		this.anno = an;
		this.targa = t;
		this.assi = 2;
		this.peso = p;
		this.altezza = alt;
		this.tariffa = 2.0;
		if (altezza < 1.30) {
			throw new ExcAltezza();
		}
			
	}
		
}

