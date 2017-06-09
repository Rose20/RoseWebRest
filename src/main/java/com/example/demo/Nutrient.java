package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Nutrient {
	private String id;
	private String name;
	private String unit;
	private double per_Hundred;
	private double per_Portion;
	private int per_Day;
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
	 * @return the per_Hundred
	 */
	public double getPer_Hundred() {
		return per_Hundred;
	}
	/**
	 * @param per_Hundred the per_Hundred to set
	 */
	public void setPer_Hundred(double per_Hundred) {
		this.per_Hundred = per_Hundred;
	}
	/**
	 * @return the per_Portion
	 */
	public double getPer_Portion() {
		return per_Portion;
	}
	/**
	 * @param per_Portion the per_Portion to set
	 */
	public void setPer_Portion(double per_Portion) {
		this.per_Portion = per_Portion;
	}
	/**
	 * @return the per_Day
	 */
	public int getPer_Day() {
		return per_Day;
	}
	/**
	 * @param per_Day the per_Day to set
	 */
	public void setPer_Day(int per_Day) {
		this.per_Day = per_Day;
	}
	
}
