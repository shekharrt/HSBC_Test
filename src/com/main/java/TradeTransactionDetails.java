package com.main.java;

import java.util.Calendar;

public class TradeTransactionDetails {

	private String tradeId;
	private Calendar trDate;
	private String inId;
	private int qty;
	private int price;
	private int amount;
	private String trader;
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public Calendar getTrDate() {
		return trDate;
	}
	public void setTrDate(Calendar trDate) {
		this.trDate = trDate;
	}
	public String getInId() {
		return inId;
	}
	public void setInId(String inId) {
		this.inId = inId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTrader() {
		return trader;
	}
	public void setTrader(String trader) {
		this.trader = trader;
	}

}
