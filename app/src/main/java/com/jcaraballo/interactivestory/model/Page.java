package com.jcaraballo.interactivestory.model;

/**
 * Created by John Caraballo on 10/26/2015.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;


    public Page(int imageId, String text, Choice choice1, Choice choice2) {
        mImageId = imageId;

        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Page(int imageId, String text) {
        mImageId = imageId;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getText() {
        return mText;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setImageId(int Id) {
        this.mImageId = Id;
    }

    public void setText(String Text) {
        this.mText = Text;
    }

    public void setChoice1(Choice choice) {
        this.mChoice1 = choice;
    }

    public void setChoice2(Choice choice) {
        this.mChoice2 = choice;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }
}
