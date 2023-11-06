/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author vishnupaduchuri
 */
public class ProductCatalog {

    private ArrayList<Product> productCatalog;

    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public Product addProduct() {
        Product productItem = new Product();
        productCatalog.add(productItem);
        return productItem;
    }

    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }

    public Product searchProduct(int id) {

        for(Product productItem : productCatalog) {
            if(productItem.getproductId() == id) {
                return productItem;
            }
        }
        return null;
    }

    public int getProductCount(){
        return productCatalog.size();
    }
}
