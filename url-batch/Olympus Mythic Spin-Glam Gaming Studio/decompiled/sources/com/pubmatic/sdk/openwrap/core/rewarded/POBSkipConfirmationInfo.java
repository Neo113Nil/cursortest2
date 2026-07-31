package com.pubmatic.sdk.openwrap.core.rewarded;

import androidx.annotation.NonNull;

/* loaded from: classes15.dex */
public class POBSkipConfirmationInfo {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public POBSkipConfirmationInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @NonNull
    public String getCloseText() {
        return this.d;
    }

    @NonNull
    public String getMessage() {
        return this.b;
    }

    @NonNull
    public String getResumeText() {
        return this.c;
    }

    @NonNull
    public String getTitle() {
        return this.a;
    }
}
