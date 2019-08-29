package com.example.android.miwok;

class Word {
    private String miwokWord;
    private String defaultWord;
    private int imageResId = -1;

    Word(String miwokWord, String defaultWord) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
    }

    Word(String miwokWord, String defaultWord, int imageResId) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.imageResId = imageResId;
    }

    String getMiwokWord() {
        return miwokWord;
    }

    String getDefaultWord() {
        return defaultWord;
    }

    boolean hasImage() {
        return imageResId != -1;
    }

    int getImageResId() {
        return imageResId;
    }
}
