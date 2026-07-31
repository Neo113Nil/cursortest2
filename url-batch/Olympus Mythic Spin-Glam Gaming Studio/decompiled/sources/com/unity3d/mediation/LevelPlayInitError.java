package com.unity3d.mediation;

import com.ironsource.C4846qe;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class LevelPlayInitError {
    private final int a;

    @NotNull
    private final String b;

    public LevelPlayInitError(int i, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.a = i;
        this.b = errorMessage;
    }

    public final int getErrorCode() {
        return this.a;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "LevelPlayError(errorCode=" + this.a + ", errorMessage='" + this.b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(@NotNull C4846qe sdkError) {
        this(sdkError.c(), sdkError.d());
        Intrinsics.checkNotNullParameter(sdkError, "sdkError");
    }
}
