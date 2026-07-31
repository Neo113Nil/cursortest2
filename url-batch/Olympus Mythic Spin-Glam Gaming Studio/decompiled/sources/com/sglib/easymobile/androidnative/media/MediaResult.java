package com.sglib.easymobile.androidnative.media;

/* loaded from: classes3.dex */
public class MediaResult {
    private String absoluteUri;
    private String contentUri;
    private MediaType type;

    public MediaResult(MediaType mediaType, String str, String str2) {
        this.type = mediaType;
        this.contentUri = str;
        this.absoluteUri = str2;
    }

    public int getType() {
        return this.type.getValue();
    }

    public String getContentUri() {
        return this.contentUri;
    }

    public String getAbsoluteUri() {
        return this.absoluteUri;
    }
}
