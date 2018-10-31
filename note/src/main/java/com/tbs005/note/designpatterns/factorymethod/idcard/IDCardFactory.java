package com.tbs005.note.designpatterns.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.tbs005.note.designpatterns.factorymethod.framework.Factory;
import com.tbs005.note.designpatterns.factorymethod.framework.Product;

public class IDCardFactory extends Factory{
	
	private List<String> owners = new ArrayList<>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		this.owners.add(((IDCard)product).getOwner());
		
	}
	
	public List<String> getOwners(){
		return this.owners;
	}

}
