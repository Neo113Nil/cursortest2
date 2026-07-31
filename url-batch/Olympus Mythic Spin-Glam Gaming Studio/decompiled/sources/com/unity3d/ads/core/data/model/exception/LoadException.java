package com.unity3d.ads.core.data.model.exception;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LoadException.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/LoadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", IronSourceConstants.EVENTS_ERROR_CODE, "", "message", "", "<init>", "(ILjava/lang/String;)V", "getErrorCode", "()I", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LoadException extends Exception {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadException(int i, @NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
