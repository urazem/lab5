package com.company.buildings.logic;

import org.apache.commons.io.filefilter.FalseFileFilter;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool = false;
    House(int length, int width, int lotlength, int lotWidth){
        super(length, width, lotlength, lotWidth);
    };
    House(int length,int width, int lotlength, int lotWidth, String owner){
        super(length, width, lotlength, lotWidth);
        this.mOwner = owner;
    };
    House(int length,int width, int lotlength, int lotWidth, String owner,boolean pool){
        super(length, width, lotlength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    };
    public boolean hasPool(){
        if(mPool == true)
            return true;
        else return false;
    };

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    public String getOwner() {

        return mOwner;
    }

    public String toString(){
        String home = "Owner: "+ mOwner;
        if(hasPool()){
            home = home + "; has a pool";
        }
        if(calcBuildingArea()<calcLotArea()){
            home = home + "; has a big open space";
        }
     return home;

    }
    public boolean equals (House Object){
        if(this.calcBuildingArea() == Object.calcBuildingArea()&& this.hasPool()==Object.hasPool()){
            return true;
        }else
            return false;

    }

}
