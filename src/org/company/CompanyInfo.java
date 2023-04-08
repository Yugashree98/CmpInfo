package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("lucid");
	}
	private void companyId() {
		System.out.println("156789");
	}
	private void companyAddress() {
		System.out.println("no 345,spark street");
	}
	public static void main(String[] args) {
		CompanyInfo cInfo = new CompanyInfo();
		cInfo.companyName();
		cInfo.companyId();
		cInfo.companyAddress();}
}
