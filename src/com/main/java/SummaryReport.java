package com.main.java;

import java.util.Calendar;

public class SummaryReport {
	private Calendar trDate;
	private String instId;
	private String instName;
	private String tradeId;
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public void setTrDate(Calendar trDate) {
		this.trDate = trDate;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public Calendar getTrDate() {
		return trDate;
	}
	public String getTradeId() {
		return tradeId;
	}
}