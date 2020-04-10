package br.com.ecommerce.dao;

import java.util.List;

import br.com.ecommerce.model.Registry;

public interface RegistryDAO {
	
	public void save(Registry registry);
	public void update(Registry registry);
	public void delete(Integer id);
	public Registry find(Integer id);
	public List<Registry> listAll();
}
