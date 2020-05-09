package com.hjy.bean;

public class BankAccount {

	private int id;
	private String acc_no;
	private String acc_password;
	private double acc_money;
	public BankAccount() {
		super();
	}
	public BankAccount(int id, String acc_no, String acc_password, double acc_money) {
		super();
		this.id = id;
		this.acc_no = acc_no;
		this.acc_password = acc_password;
		this.acc_money = acc_money;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_password() {
		return acc_password;
	}
	public void setAcc_password(String acc_password) {
		this.acc_password = acc_password;
	}
	public double getAcc_money() {
		return acc_money;
	}
	public void setAcc_money(double acc_money) {
		this.acc_money = acc_money;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(acc_money);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((acc_no == null) ? 0 : acc_no.hashCode());
		result = prime * result + ((acc_password == null) ? 0 : acc_password.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(acc_money) != Double.doubleToLongBits(other.acc_money))
			return false;
		if (acc_no == null) {
			if (other.acc_no != null)
				return false;
		} else if (!acc_no.equals(other.acc_no))
			return false;
		if (acc_password == null) {
			if (other.acc_password != null)
				return false;
		} else if (!acc_password.equals(other.acc_password))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", acc_no=" + acc_no + ", acc_password=" + acc_password + ", acc_money="
				+ acc_money + "]";
	}
	
}
