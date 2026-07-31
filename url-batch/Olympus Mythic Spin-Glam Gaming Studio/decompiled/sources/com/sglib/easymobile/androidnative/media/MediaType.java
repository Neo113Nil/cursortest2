package com.sglib.easymobile.androidnative.media;

/* loaded from: classes5.dex */
public enum MediaType {
    None(0),
    Image(1),
    Video(2);

    private final int value;

    MediaType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
