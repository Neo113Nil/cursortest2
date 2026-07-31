package com.sglib.easymobile.androidnative.media;

/* loaded from: classes3.dex */
public enum ImageFormat {
    JPG(0),
    PNG(1);

    private final int value;

    ImageFormat(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public static ImageFormat fromInt(int i) {
        ImageFormat imageFormat = JPG;
        return i == imageFormat.getValue() ? imageFormat : PNG;
    }
}
