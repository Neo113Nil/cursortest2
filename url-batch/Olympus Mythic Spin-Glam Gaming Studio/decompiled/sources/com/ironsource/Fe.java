package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Fe {

    @Nullable
    private static Boolean b;

    @NotNull
    public static final Fe a = new Fe();

    @NotNull
    private static Ee c = Ee.NOT_INIT;

    private Fe() {
    }

    @NotNull
    public final synchronized Ee a() {
        return c;
    }

    @NotNull
    public final Ee b() {
        Boolean bool = b;
        if (bool == null ? true : Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return Ee.NOT_INIT;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final synchronized void a(@NotNull Ee ee) {
        Intrinsics.checkNotNullParameter(ee, "<set-?>");
        c = ee;
    }

    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }
}
