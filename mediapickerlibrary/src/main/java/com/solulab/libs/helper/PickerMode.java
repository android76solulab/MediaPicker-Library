package com.solulab.libs.helper;

import android.support.annotation.IntDef;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class PickerMode implements Serializable {

    public static final String TYPE_INTENT = "picker_type";
    public static final int IMAGE_ = 0;
    public static final int VIDEO_ = 1;
    public static final int IMAGE_VIDEO_ = 2;

    @PickerType
    public int mCurrentPicker = VIDEO_;

    public PickerMode() {
    }

    @IntDef({IMAGE_, VIDEO_, IMAGE_VIDEO_})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PickerType {
    }
}