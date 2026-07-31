package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes5.dex */
public class POBNativeAdLinkResponse {
    private final String a;
    private final List b;
    private final String c;

    public POBNativeAdLinkResponse(@NonNull String str, @Nullable List<String> list, @Nullable String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    @Nullable
    public List<String> getClickTrackers() {
        return this.b;
    }

    @Nullable
    public String getFallbackURL() {
        return this.c;
    }

    @NonNull
    public String getUrl() {
        return this.a;
    }

    @NonNull
    public String toString() {
        return "Url: " + this.a + "\nClick Trackers: " + getClickTrackers() + "\nFallback Url: " + this.c;
    }
}
