package com.jaya.SpringSecurityGrocerySaleProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesService {
	@Autowired
	private SalesRepository repo;
	
	public List<Sale> listAll() {		
		return repo.findAll();
	}
	
	public void save(Sale sale) {
		repo.save(sale);
	}
	
	public Sale get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
