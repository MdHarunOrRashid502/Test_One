package com.example.homepage;

public class ExampleItem {
    private int mImageResource;
    private int mImageResource2;
    private String mText1;
    private String mText2;

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public void setmImageResource2(int mImageResource2) {
        this.mImageResource2 = mImageResource2;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public int getmImageResource2() {
        return mImageResource2;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }

    public ExampleItem(int mImageResource, int mImageResource2, String mText1, String mText2) {
        this.mImageResource = mImageResource;
        this.mImageResource2 = mImageResource2;
        this.mText1 = mText1;
        this.mText2 = mText2;
    }
}
