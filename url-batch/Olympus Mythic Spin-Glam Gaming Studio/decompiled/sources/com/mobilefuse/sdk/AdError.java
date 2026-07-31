package com.mobilefuse.sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdError.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/mobilefuse/sdk/AdError;", "", IronSourceConstants.EVENTS_ERROR_CODE, "", "errorMessage", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "AD_ALREADY_LOADED", "AD_ALREADY_RENDERED", "NO_FILL", "INCORRECT_ADM", "AD_RUNTIME_ERROR", "AD_LOAD_ERROR", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public enum AdError {
    AD_ALREADY_LOADED(1, "ad is already loaded"),
    AD_ALREADY_RENDERED(4, "ad was already rendered"),
    NO_FILL(204, "ad no fill"),
    INCORRECT_ADM(2, "incorrect adm"),
    AD_RUNTIME_ERROR(3, "ad runtime error"),
    AD_LOAD_ERROR(5, "ad load error");

    private final int errorCode;

    @Nullable
    private final String errorMessage;

    AdError(int i, String str) {
        this.errorCode = i;
        this.errorMessage = str;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
