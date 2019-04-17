package fr.afcepf.al33.tp.test;

import fr.afcepf.al33.tp.dao.ProduitDaoJpa;

public class TestSingletonApp {
	
	public static void m1() {
		ProduitDaoJpa dao = ProduitDaoJpa.getInstance();
		System.out.println(dao.toString());
		System.out.println(dao.getData());
	}

	public static void main(String[] args) {
		ProduitDaoJpa produitDao = null; 
		
		//v�rifier new direct interdit si constructeur priv� 
		//dans classe ProduitDaoJpa
		//produitDao = new ProduitDaoJpa();
		
		// cr�er une instance via un appel � .getInstance()
		produitDao = ProduitDaoJpa.getInstance();
		produitDao.setData("abc");
		
		//appeler la m�thode .toString() sur l'unique instance r�cup�r�e
		
		System.out.println(produitDao.toString());
        m1();
	}

}
