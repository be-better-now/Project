/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author huudu
 */
public class FlowerDTO {
    private String flowerID;
    private String flowerName;
    private String quality;
    private String category;
    private double price;
    private int quantity;

    public FlowerDTO() {
    }

    public FlowerDTO(String flowerID, String flowerName, String quality, String category, double price, int quantity) {
        this.flowerID = flowerID;
        this.flowerName = flowerName;
        this.quality = quality;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getFlowerID() {
        return flowerID;
    }

    public void setFlowerID(String flowerID) {
        this.flowerID = flowerID;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}




