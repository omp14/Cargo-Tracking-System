package com.nis.model;

public class Tracking {
private int trackingtransactionid;
private int trackingid;
private int employeeid;
private String tdate;
private String ttime;
private String discription;
private String lat;
private String lng;
public int getTrackingtransactionid(){
	return trackingtransactionid;
}
public void setTrackingtrackingid(int trackingtransactionid){
	this.trackingtransactionid=trackingtransactionid;
}
public int getTrackingid(){
	return trackingid;
	
}
public void setTrackingid(int trackingid){
	this.trackingid=trackingid;
}
public int getEmployeeid(){
	return employeeid;
}
public void setEmployeeid(int employeeid){
	this.employeeid=employeeid;
}
public String getTdate(){
	return tdate;
}
public void setTdate(String tdate){
	this.tdate=tdate;
}
public String getTtime(){
	return ttime;
}
public void setTtime(String ttime){
	this.ttime=ttime;
}
public String getDiscription(){
	return discription;
}
public void setDiscription(String discription){
	this.discription=discription;
}
public String getLat(){
	return lat;
}
public void setLat(String lat){
	this.lat=lat;
}
public String getLng(){
	return lng;
}
public void setLng(String lng){
	this.lng=lng;
}
}
