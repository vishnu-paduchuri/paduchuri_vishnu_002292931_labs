/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vishnupaduchuri
 */
public class VitalSignsHistory {
    private ArrayList<VitalSigns> history;
    
    public VitalSignsHistory() {
        this.history = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVital() {
      VitalSigns newVitalSign = new VitalSigns();
      history.add(newVitalSign);
      return newVitalSign;
    } 
    
    public void deleteVitals(VitalSigns vitalSign) {
        history.remove(vitalSign);
    }
    
}
