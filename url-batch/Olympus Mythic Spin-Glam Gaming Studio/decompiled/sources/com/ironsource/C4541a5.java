package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.a5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4541a5 {

    @NotNull
    public static final C4541a5 a = new C4541a5();

    private C4541a5() {
    }

    public final boolean a(@Nullable IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
