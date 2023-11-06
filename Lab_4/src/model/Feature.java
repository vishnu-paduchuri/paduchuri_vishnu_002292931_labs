/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vishnupaduchuri
 */
public class Feature {
    private Product owner;
    private String name;
    private String value;

    public Feature(Product owner){
        this.owner = owner;
    }

    public Feature(String name, String value){
        this.name = name;
        this.value = value;
    }

    public Product getOwner() {
        return this.owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return this.name;
    }
}


