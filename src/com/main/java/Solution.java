package com.main.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class Solution {
	private static final String FILENAME1 = "inst.txt";
	private static final String FILENAME2 = "trades.txt";

	// Author :Shekhar
	
	public static void readTradeFile() {
		BufferedReader br = null;
		FileReader fr = null;

		List<String> data1 = new ArrayList<String>();
		
		List<TradeTransactionDetails> trData = new ArrayList<TradeTransactionDetails>();
		List<SummaryReport> srData = new ArrayList<SummaryReport>();

		

		// br = new BufferedReader(new FileReader(FILENAME));
		try {
			fr = new FileReader(FILENAME1);

			br = new BufferedReader(fr);

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				data1.add(sCurrentLine);
			}

			if (data1 != null && !data1.isEmpty()) {
				for (String rows : data1) {
					String[] row = rows.split(Pattern.quote(","));
					if (row == null || row.length < 7) {
						continue;
					} else {
						TradeTransactionDetails tr = new TradeTransactionDetails();

						tr.setTradeId(row[0]);
						tr.setInId(row[1]);
						int a = Integer.parseInt(row[2]);
						tr.setQty(a);
						int b = Integer.parseInt(row[3]);
						tr.setPrice(b);
						int c = Integer.parseInt(row[4]);
						tr.setAmount(c);

						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						Date date = sdf.parse(row[5]);
						Calendar cal = Calendar.getInstance();
						cal.setTime(date);

						tr.setTrDate(cal);
						tr.setTrader(row[6]);

						trData.add(tr);
					}
				}
			}
			if (trData != null && !trData.isEmpty()) {
				for (TradeTransactionDetails ta : trData) {
					SummaryReport sr = new SummaryReport();
					int j = 0;
					String tradeId = ta.getTradeId();
					Calendar c = ta.getTrDate();
					String insId=ta.getInId();
					sr.setTradeId(tradeId);
					sr.setTrDate(c);
					sr.setInstId(insId);
					srData.add(sr);
		}
			}
			if (srData != null && !srData.isEmpty()) {
				FileWriter fw = new FileWriter("report.txt");
				for (SummaryReport s : srData) {
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
					String cal = formatter.format(s.getTrDate().getTime());
					String row = s.getTradeId() + " " + s.getInstId() + " " + cal + " " + s.getInstName() + " " + s.getTrDate();
					fw.write(row);
					fw.write("\n");
				}
				fw.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void readInstFile() {
		BufferedReader br = null;
		FileReader fr = null;

		List<String> data2 = new ArrayList<String>();
		/*
		 * List<TransactionAttributes> trData = new ArrayList<TransactionAttributes>();
		 * List<SummaryReport> srData = new ArrayList<SummaryReport>();
		 * List<SummaryReport> report = new ArrayList<SummaryReport>();
		 */
		List<InstrumentDetails> srData = new ArrayList<InstrumentDetails>();

		// br = new BufferedReader(new FileReader(FILENAME));
		try {
			fr = new FileReader(FILENAME2);

			br = new BufferedReader(fr);

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				data2.add(sCurrentLine);
			}

			if (data2 != null && !data2.isEmpty()) {
				for (String rows : data2) {
					String[] row = rows.split(Pattern.quote(","));
					if (row == null || row.length < 3) {
						continue;
					} else {
						InstrumentDetails tr = new InstrumentDetails();

						tr.setInstId(row[0]);
						tr.setInstName(row[1]);

						srData.add(tr);
					}
				}
			}
			
}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

