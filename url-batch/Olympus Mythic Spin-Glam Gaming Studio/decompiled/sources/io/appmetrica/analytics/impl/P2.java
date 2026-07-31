package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes8.dex */
public abstract class P2 implements Ta {
    public final int a;

    public P2(int i) {
        this.a = i;
    }

    @VisibleForTesting
    public final int a() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public abstract /* synthetic */ C5318eo a(@Nullable Object obj);
}
