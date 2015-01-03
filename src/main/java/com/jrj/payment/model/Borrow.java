package com.jrj.payment.model;

public class Borrow {
	private Long id = 0L;
	private String userId;
	private Double totalLoan;
	private Double annualRate;
	private Integer periods = 0;
	private Double monthlyRepayment;
	private Double totalRepayment;
	private String title;
	private String purpose;
	private String illustrate;
	private Integer state=0;
	private String ctime;
	private String utime;
	private String btime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Double getTotalLoan() {
		return totalLoan;
	}
	public void setTotalLoan(Double totalLoan) {
		this.totalLoan = totalLoan;
	}
	public Double getAnnualRate() {
		return annualRate;
	}
	public void setAnnualRate(Double annualRate) {
		this.annualRate = annualRate;
	}
	public Integer getPeriods() {
		return periods;
	}
	public void setPeriods(Integer periods) {
		this.periods = periods;
	}
	public Double getMonthlyRepayment() {
		return monthlyRepayment;
	}
	public void setMonthlyRepayment(Double monthlyRepayment) {
		this.monthlyRepayment = monthlyRepayment;
	}
	public Double getTotalRepayment() {
		return totalRepayment;
	}
	public void setTotalRepayment(Double totalRepayment) {
		this.totalRepayment = totalRepayment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getIllustrate() {
		return illustrate;
	}
	public void setIllustrate(String illustrate) {
		this.illustrate = illustrate;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public String getUtime() {
		return utime;
	}
	public void setUtime(String utime) {
		this.utime = utime;
	}
	public String getBtime() {
		return btime;
	}
	public void setBtime(String btime) {
		this.btime = btime;
	}
	

}
