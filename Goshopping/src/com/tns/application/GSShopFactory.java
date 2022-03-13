package com.tns.application;

import java.util.*;

import com.tns.framework.*;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc p = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {

		NormalAcc n = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return n;
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		float chg = sc.nextFloat();
		float chg = 1000;

		GSShopFactory u = new GSShopFactory();

		PrimeAcc p = u.getNewPrimeAccount(1, "Vishal1", 1000, true);
		NormalAcc n = u.getNewNormalAccount(2, "Vishal2", 1000, 50);

		p.bookProduct(chg);
		n.bookProduct(chg);
	}

}
