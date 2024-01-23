package Proyecto2;

public class Destiny {
    private String season;
    private String country;
    private String activite;
    private int cost;
    public Destiny(String season, String country, String activite, int cost) {
        super();
        this.season = season;
        this.country = country;
        this.activite = activite;
        this.cost = cost;
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getActivite() {
        return activite;
    }
    public void setActivite(String activite) {
        this.activite = activite;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
    
}
