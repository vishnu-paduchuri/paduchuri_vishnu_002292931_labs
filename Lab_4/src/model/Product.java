/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author vishnupaduchuri
 */
public class Product {
    private static int productCount = 0;
    private String productName;
    private int price;
    private int productId;
    private ImageIcon productImage;
    private ArrayList<Feature> featureList;

    public Product() {
        this.productCount++;
        this.productId = this.productCount;
        this.featureList = new ArrayList<Feature>();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getproductId() {
        return productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ImageIcon getProductImage() {
        return this.productImage;
    }

    public void setProductImage(ImageIcon productImage) {
        this.productImage = productImage;
    }

    public Feature addNewFeatures() {
        Feature newFeature = new Feature(this);
        featureList.add(newFeature);
        return newFeature;
    }

    public ArrayList<Feature> getProductFeatures() {
        return featureList;
    }

    @Override
    public String toString() {
        return this.productName;
    }

}
