package com.suresh;

public class MoneyChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(getMoneyChange(args));
		MoneyChange mc  = new MoneyChange();
		System.out.println(mc.getMoneyChange(args));
		

	}

	private  String getMoneyChange(String[] args) {
		int num = new Integer(args[0]).intValue();
		int noOf100p ;
		int noOf50p ;
		int noOf20p ;
		int noOf10p ;
		int noOf5p ;
		int noOf2p ;
		int noOf1p ;
		noOf100p = num/100;
		num = num%100;
		noOf50p = num/50;
		num = num%50;
		noOf20p = num/20;
		num = num%20;
		noOf10p = num/10;
		num = num%10;
		noOf5p = num/5;
		num = num%5;
		noOf1p = num/1;
		
		return  "noOf100p == "+noOf100p +"noOf50p == "+noOf50p + "noOf20p == "+noOf20p +"noOf10p == "+noOf10p +"noOf5p == "+noOf5p +"noOf1p == "+noOf1p;
	}

}
