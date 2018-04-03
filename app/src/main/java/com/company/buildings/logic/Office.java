package com.company.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {

    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices=0;
    Office(int length,int width, int lotLength, int lotWidth){
        super(length, width,lotLength,lotWidth);
        this.mBusinessName = null;
        this.mParkingSpaces = 0;
        sTotalOffices += 1;

    }
    Office(int length,int width, int lotLength, int lotWidth,String BusinessName){
        super(length,width,lotLength,lotWidth);
        this.mBusinessName = BusinessName;
        sTotalOffices += 1;
    }
    Office(int length, int width, int lotLength, int lotWidth, String BusinessName, int parkingSpaces){
        super(length, width, lotLength,lotWidth);
        this.mBusinessName = BusinessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices += 1;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    public String getBusinessName(){
        return this.mBusinessName;
    }

    public String toString(){
        if(mBusinessName == null){
            if(getParkingSpaces()>0){
                return "unoccupied; has "+ getParkingSpaces() + " parking spaces (total offices: " + sTotalOffices + ")";
            }else
                return "Business: unoccupied" + " (total offices: "+ sTotalOffices +")";
        }
        else{
            if(getParkingSpaces()>0){
                return mBusinessName + "; has " + getParkingSpaces() + "parking spaces (total offices: "+ sTotalOffices + ")";
            }else
                return mBusinessName + "(total offices: "+sTotalOffices + ")";
        }
    }
    public boolean equals(Office office){
        if(this.calcBuildingArea() == office.calcBuildingArea()&&this.getParkingSpaces()==office.getParkingSpaces()){
            return true;
        }else
            return false;


    }
    
}
