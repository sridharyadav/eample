package com.capgemini.dd.dto;

import java.sql.Date;

public class UpdateStock {
	private String orderId;
	private String name;
	private double pricePerUnit;
	private String quantityUnit;
	private double Price;
	private String wareHouseId;
	private String deliveryDate;
	private String manufactureDate;
	private String expireDate;
	private String quantityCheck;
	private String processDate;










	public String getProcessDate() {
		return processDate;
	}


	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}


	


	public UpdateStock(String orderId, String name, double pricePerUnit, String quantityUnit, double price,
			String wareHouseId,  String quantityCheck) {
		super();
	  	this.orderId = orderId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantityUnit = quantityUnit;
		Price = price;
		this.wareHouseId = wareHouseId;
		
		this.quantityCheck = quantityCheck;
		
	}


	public UpdateStock() {
		// TODO Auto-generated constructor stub
	}


	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getWareHouseId() {
		return wareHouseId;
	}
	public void setWareHouseId(String wareHouseId) {
		this.wareHouseId = wareHouseId;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getQuantityCheck() {
		return quantityCheck;
	}
	public void setQuantityCheck(String quantityCheck) {
		this.quantityCheck = quantityCheck;
	}


	@Override
	public String toString() {
		return " [orderId=" + orderId + ", name=" + name + ", pricePerUnit=" + pricePerUnit
				+ ", quantityUnit=" + quantityUnit + ", Price=" + Price + ", wareHouseId=" + wareHouseId
				+ ", deliveryDate=" + deliveryDate + ", manufactureDate=" + manufactureDate + ", expireDate="
				+ expireDate + ", quantityCheck=" + quantityCheck + ", processDate=" + processDate + "]\n";
	}

}
