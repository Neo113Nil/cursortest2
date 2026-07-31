package com.sglib.easymobile.androidnative.media;

/* loaded from: classes10.dex */
public enum CameraType {
    Front(0),
    Rear(1);

    private final int value;

    CameraType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public static CameraType fromInt(int i) {
        if (i == 0) {
            return Front;
        }
        if (i == 1) {
            return Rear;
        }
        return Front;
    }
}
