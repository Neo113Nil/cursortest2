package com.my.target.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public class ShareButtonData {

    @Nullable
    public String imageUrl;

    @Nullable
    public String name;

    @Nullable
    public String url;

    private ShareButtonData() {
    }

    @NonNull
    public static ShareButtonData newData() {
        return new ShareButtonData();
    }

    @Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    @Nullable
    public String getUrl() {
        return this.url;
    }

    public void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public void setName(@Nullable String str) {
        this.name = str;
    }

    public void setUrl(@Nullable String str) {
        this.url = str;
    }
}
