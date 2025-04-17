package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String phoneModel;
    private String carrierName;
    private String phoneNumber;
    private String ownersName;

    public CellPhone(){
        this.serialNumber = 0;
        this.phoneModel = "";
        this.carrierName = "";
        this.phoneNumber = "";
        this.ownersName = "";

    }
    public int getSerialNumber(){
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getphoneModel(){
        return this.phoneModel;
    }
    public void setphoneModel(String phoneModel){
        this.phoneModel= phoneModel;
    }
    public String getcarrierName(){
        return this.carrierName;
    }
    public void setcarrierName(String carrierName){
        this.carrierName = carrierName;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getownersName(){
        return this.ownersName;
    }
    public void  setownersName(String ownersName){
        this.ownersName = ownersName;
    }
}
