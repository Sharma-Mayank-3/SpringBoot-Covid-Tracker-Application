package com.example.SpringBootTestApiApp1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CovidModel {

	private String state_name;
	private String active;
	private String positive;
	private String cured;
	private String death;
	private String new_active;
	private String new_positive;
	private String new_death;
	private String total;
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getPositive() {
		return positive;
	}
	public void setPositive(String positive) {
		this.positive = positive;
	}
	public String getCured() {
		return cured;
	}
	public void setCured(String cured) {
		this.cured = cured;
	}
	public String getDeath() {
		return death;
	}
	public void setDeath(String death) {
		this.death = death;
	}
	public String getNew_active() {
		return new_active;
	}
	public void setNew_active(String new_active) {
		this.new_active = new_active;
	}
	public String getNew_positive() {
		return new_positive;
	}
	public void setNew_positive(String new_positive) {
		this.new_positive = new_positive;
	}
	public String getNew_death() {
		return new_death;
	}
	public void setNew_death(String new_death) {
		this.new_death = new_death;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
}
