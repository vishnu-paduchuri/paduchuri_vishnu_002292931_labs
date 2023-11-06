/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.ImageIcon;

/**
 *
 * @author vishnupaduchuri
 */
public class Supplier {
    private String supplyName;
    private String supplierDescription;
    private ProductCatalog productCatalog;
    private ImageIcon supplierImage;

    public ImageIcon getSupplierImage() {
        return this.supplierImage;
    }

    public void setSupplierImage(ImageIcon supplierImage) {
        this.supplierImage = supplierImage;
    }

    public Supplier() {
        this.productCatalog = new ProductCatalog();
    }

    public String getSupplyName() {
        return this.supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }
    
    public String getSupplyDesc() {
        return this.supplierDescription;
    }

    public void setSupplyDesc(String supplierDescription) {
        this.supplierDescription = supplierDescription;
    }

    public ProductCatalog getProductCatalog() {
        return this.productCatalog;
    }

    @Override
    public String toString() {
        return this.supplyName;
    }
}
