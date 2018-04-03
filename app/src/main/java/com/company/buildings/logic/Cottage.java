package com.company.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage 
       extends House {
       
    // TODO - Put your code here.
    private boolean mSecondFloor;

    Cottage(int dimension, int lotLength, int lotWidth){
        super(dimension, dimension, lotLength, lotWidth);
    };
    Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor){
        super(dimension, dimension, lotLength, lotWidth, owner);
        this.mSecondFloor = secondFloor;
    };
    public boolean hasSecondFloor(){
        if (mSecondFloor == true){
            return true;
        }else
            return false;
    };
    public String toString(){
        if(mSecondFloor){
            return super.toString() + "; is a two story cottage";
        }else
            return super.toString() + "; is a cottage";

    };
    
}

