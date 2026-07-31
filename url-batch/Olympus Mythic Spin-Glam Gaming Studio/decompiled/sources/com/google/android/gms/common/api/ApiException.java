package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public class ApiException extends Exception {

    @NonNull
    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(@NonNull Status status) {
        super(r4.toString());
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(statusCode).length() + 2 + String.valueOf(statusMessage).length());
        sb.append(statusCode);
        sb.append(": ");
        sb.append(statusMessage);
        this.mStatus = status;
    }

    @NonNull
    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @Nullable
    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
