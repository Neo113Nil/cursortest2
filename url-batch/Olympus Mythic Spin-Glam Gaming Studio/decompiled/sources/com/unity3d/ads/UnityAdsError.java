package com.unity3d.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnityAdsError.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/UnityAdsError;", "", "code", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnityAdsError {
    private final int code;

    @NotNull
    private final String message;

    public UnityAdsError(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
