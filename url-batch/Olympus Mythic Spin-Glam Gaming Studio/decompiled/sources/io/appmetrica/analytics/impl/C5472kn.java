package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.kn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5472kn extends Pi {
    public C5472kn(@NotNull Context context, @NotNull String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.Pi
    public final Object a(int i) {
        return this.a.getResources().getStringArray(i);
    }

    @Nullable
    public final String[] b(int i) {
        return this.a.getResources().getStringArray(i);
    }
}
