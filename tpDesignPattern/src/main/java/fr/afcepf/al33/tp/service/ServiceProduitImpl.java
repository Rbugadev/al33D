package fr.afcepf.al33.tp.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import fr.afcepf.al33.tp.dao.DaoProduit;
import fr.afcepf.al33.tp.traducteur.Traducteur;

public class ServiceProduitImpl implements ServiceProduit {
	
	@Inject //pour demander � initialiser la r�f�rence daoProduit
	        //de fa�on � ce que �a pointe vers un composant existant 
	        //dont le type (DaoProduitV1 ou DaoProduitV2) est compatible
	        //avec l'interface DaoProduit
	private DaoProduit daoProduit; //null par defaut (sans @Inject)
	
	@Inject
	private Traducteur traducteur;  //null par defaut (sans @Inject)

	@Override
	public List<String> rechercherProduits() {
		//code am�liorable
		List<String> listProdTrad= new ArrayList<>();
		List<String> listProd= daoProduit.findProducts();
		for(String s :listProd) {
			listProdTrad.add(traducteur.traduire(s));
		}
		return listProdTrad;
	}

}
