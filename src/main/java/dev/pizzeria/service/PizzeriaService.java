package dev.pizzeria.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import dev.pizzeria.domain.Client;
import dev.pizzeria.domain.Livreur;
import dev.pizzeria.domain.Pizza;

public class PizzeriaService {
	
	Map<UUID, Client> clients = new HashMap<>();
	Map<UUID, Pizza> pizzas = new HashMap<>();
	Map<UUID, Livreur> livreurs = new HashMap<>();
	
	public void sauverClient(String nom, String prenom, String ville, int age) {
		Client client = new Client(UUID.randomUUID(), nom, prenom, ville , age);
		this.clients.put(client.getUuid(), client);
	}
	
	public Map<UUID, Client> getClients(){
		return clients;
	}
	
	public void sauverPizza(String libelle, String reference, double prix, String url){
		Pizza pizza = new Pizza(UUID.randomUUID(), libelle, reference, prix, url);
		this.pizzas.put(pizza.getUuid(), pizza);
	}
	
	public Map<UUID, Pizza> getPizzas(){
		return pizzas;
	}
	
	public void sauverLivreurs(String nom, String prenom, String ville, int age, String locomotion) {
		Livreur livreur = new Livreur(UUID.randomUUID(), nom, prenom, ville , age, locomotion);
		this.livreurs.put(livreur.getUuid(), livreur);
	}
	
	public Map<UUID, Livreur> getLivreurs(){
		return livreurs;
	}
}
