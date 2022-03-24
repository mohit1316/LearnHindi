package com.example.learnhindi;

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mHindiTranslation;
    private int mImageResourceId=noImage_provided;
    private static final int noImage_provided=-1;
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *  @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param hindiTranslation is the word in the Miwok language

     */
    public Word(String defaultTranslation, String hindiTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
        mAudioResourceId=audioResourceId;

    }
    public Word(String defaultTranslation,String hindiTranslation,int imageResourceId ,int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mHindiTranslation=hindiTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mHindiTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId!=noImage_provided;
    }
}

