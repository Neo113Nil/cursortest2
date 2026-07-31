package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes11.dex */
public class POBSegment {
    private final String a;
    private String b;
    private String c;

    public POBSegment(@NonNull String str) {
        this.a = str;
    }

    @Nullable
    public String getName() {
        return this.b;
    }

    @NonNull
    public String getSegId() {
        return this.a;
    }

    @Nullable
    public String getValue() {
        return this.c;
    }

    public void setValue(@NonNull String str) {
        this.c = str;
    }

    public POBSegment(@NonNull String str, @NonNull String str2) {
        this.a = str;
        this.b = str2;
    }
}
