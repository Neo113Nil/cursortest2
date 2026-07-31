package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public abstract class He {
    public final int a = -1;
    public final int b = 0;
    public final int c = 1;

    public final int a(@Nullable Boolean bool) {
        if (bool == null) {
            return this.a;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return this.b;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return this.c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final Boolean a(int i) {
        if (i == this.b) {
            return Boolean.FALSE;
        }
        if (i == this.c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
