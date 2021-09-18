package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID =1L;
	
	private String sellerName;
	private Long vistited;
	private Long deals;
	
	public SaleSuccessDTO() {
	}
	
	public SaleSuccessDTO(Seller seller, Long vistited, Long deals) {
		sellerName = seller.getName();
		this.vistited = vistited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVistited() {
		return vistited;
	}

	public void setVistited(Long vistited) {
		this.vistited = vistited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	
}
