package com.company.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;
    Building (int length, int width, int LotLength, int LotWidth){
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = LotLength;
        this.mLotWidth = LotWidth;
    };

    public void setLength(int mLength) {
        this.mLength = mLength;
    }
    public void setWidth(int mWidth) {
        this.mWidth = mWidth;
    }
    public void setLotLength(int mLotLength) {
        this.mLotLength = mLotLength;
    }
    public void setLotWidth(int mLotWidth) {
        this.mLotWidth = mLotWidth;
    }
    public int getLotWidth() {

        return mLotWidth;
    }
    public int getLength() {
        return mLength;
    }
    public int getWidth() {
        return mWidth;
    }
    public int getLotLength() {
        return mLotLength;
    }
    public int calcBuildingArea(){
        return getWidth()*getLength();
    }
    public int calcLotArea(){
        return getLotLength()*getLotWidth();
    }
    public String toString(){
        return "Length: "+ getLength()+"Width: "+getWidth()+"LotWLength: "+getLotLength()+"LotWidth: "+getLotWidth();
    }


}

