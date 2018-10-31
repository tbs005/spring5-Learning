package com.tbs005.note.designpatterns.factorymethod.framework;

public abstract class Factory {
	
	public final Product create(String owner){
		Product product = createProduct(owner);
		registerProduct(product);
		return product;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);

}
