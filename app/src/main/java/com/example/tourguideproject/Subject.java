package com.example.tourguideproject;

/**
 * {@link Subject} gives information about chosen subject
 * gives name and photo
 */
public class Subject {

    //Name of subject
    private final String mSetName;
    //Photo of subject
    private final int mImageResourceId;

    /**
     * Create a new {@link Subject} object.
     *
     * @param setName         is the name of an attraction place.
     * @param imageResourceId is the photo of an attraction place.
     */
    public Subject(String setName, int imageResourceId) {
        mSetName = setName;
        mImageResourceId = imageResourceId;
    }


    // Get the name of subject
    public String getSetName() {
        return mSetName;
    }

    // Get the photo's ID of subject
    public int getImageResourceId() {
        return mImageResourceId;
    }
}