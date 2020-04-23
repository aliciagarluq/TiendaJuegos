package model;

public class Juegos {
private String title;
private int ram;
private double price;
private String platform;
private String SO;
/**
 * builder
 * @param title JUEGO
 * @param ram MINIMUM RAM
 * @param price ACCORDING TO PLATFORM
 * @param platform GAME
 */
public Juegos(String title, int ram, double price, String platform,String SO) {

	this.title = title;
	this.ram = ram;
	this.price = price;
	this.platform = platform;
	this.SO=SO;
}
public Juegos() {

	this.title = "";
	this.ram = 0;
	this.price = 0.0;
	this.platform = "";
	this.SO="";
	
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getPlatform() {
	return platform;
}
public void setPlatform(String platform) {
	this.platform = platform;
}


public String getSO() {
	return SO;
}
public void setSO(String sO) {
	SO = sO;
}
@Override
public String toString() {
	return "Juegos [title=" + title + ", ram=" + ram + ", price=" + price + ", platform=" + platform + ", SO=" + SO
			+ "]";
}





}
