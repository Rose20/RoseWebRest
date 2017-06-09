package com.example.demo;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	private String id;
	private String name;
	private String ingredients;
	private int quantity;
	private String unit;
	private int portionQuantity;
	private String portionUnit;
	private ArrayList<Nutrient> nutrients;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the ingredients
	 */
	public String getIngredients() {
		return ingredients;
	}
	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return the portionQuantity
	 */
	public int getPortionQuantity() {
		return portionQuantity;
	}
	/**
	 * @param portionQuantity the portionQuantity to set
	 */
	public void setPortionQuantity(int portionQuantity) {
		this.portionQuantity = portionQuantity;
	}
	/**
	 * @return the portionUnit
	 */
	public String getPortionUnit() {
		return portionUnit;
	}
	/**
	 * @param portionUnit the portionUnit to set
	 */
	public void setPortionUnit(String portionUnit) {
		this.portionUnit = portionUnit;
	}
	/**
	 * @return the nutrients
	 */
	public ArrayList<Nutrient> getNutrients() {
		return nutrients;
	}
	/**
	 * @param nutrients the nutrients to set
	 */
	public void setNutrients(ArrayList<Nutrient> nutrients) {
		this.nutrients = nutrients;
	}
	
}
