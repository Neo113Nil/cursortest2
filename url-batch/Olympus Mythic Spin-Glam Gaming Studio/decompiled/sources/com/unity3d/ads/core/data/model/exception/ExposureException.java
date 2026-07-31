package com.unity3d.ads.core.data.model.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExposureException.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/ExposureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "parameters", "", "", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ExposureException extends Exception {

    @NotNull
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(@NotNull String message, @NotNull Object[] parameters) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.parameters = parameters;
    }

    @NotNull
    public final Object[] getParameters() {
        return this.parameters;
    }
}
