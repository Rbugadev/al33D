package fr.afcepf.al33.tp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import fr.afcepf.al33.tp.entity.Client;
import fr.afcepf.al33.tp.entity.Compte;

//@Component //@Repository
public class DaoClientSimu implements DaoClient {
	private long maxNumClient=0;
	private Map<Long,Client> mapClients = new HashMap<>();

	@Override
	public Client findById(Long numero) {
		return mapClients.get(numero);
	}

	@Override
	public List<Client> findAll() {
		return new ArrayList<>(mapClients.values());
	}

	@Override
	public void save(Client c) {
		if(c.getNumero()==null) {
			c.setNumero(++maxNumClient);
		}
		mapClients.put(c.getNumero(),c);
	}

	@Override
	public void deleteById(Long numero) {
		mapClients.remove(numero);
	}

	@Override
	public List<Compte> findComptesOfClient(Long numClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCompteForClient(Long numClient, Long numCompte) {
		// TODO Auto-generated method stub
		
	}

	

}
