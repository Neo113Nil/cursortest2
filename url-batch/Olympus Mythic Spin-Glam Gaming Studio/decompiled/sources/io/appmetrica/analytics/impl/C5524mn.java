package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.mn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5524mn extends Pi {
    public C5524mn(@NonNull Context context, @NonNull String str) {
        super(context, str, "string");
    }

    @Override // io.appmetrica.analytics.impl.Pi
    @Nullable
    public final Object a(int i) {
        return this.a.getString(i);
    }

    @Nullable
    public final String b(int i) {
        return this.a.getString(i);
    }
}
