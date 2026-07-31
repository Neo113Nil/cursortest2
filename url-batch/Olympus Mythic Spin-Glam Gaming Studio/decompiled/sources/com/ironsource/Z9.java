package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Z9 {

    @NotNull
    public static final Z9 a = new Z9();

    private Z9() {
    }

    public static final <T> T a(@Nullable T t, T t2) {
        return t == null ? t2 : t;
    }

    public static final boolean a(@Nullable Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "reference is null";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return a(obj, str, z);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String errorMessage, boolean z) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z) {
            throw new NullPointerException(errorMessage);
        }
        if (!z) {
            IronLog.API.error(errorMessage);
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
