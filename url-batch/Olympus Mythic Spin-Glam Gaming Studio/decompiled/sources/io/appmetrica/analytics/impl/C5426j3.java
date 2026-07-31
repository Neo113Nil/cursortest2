package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5426j3 extends Pi {
    public C5426j3(@NonNull Context context, @NonNull String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Pi
    @Nullable
    public final Object a(int i) {
        return Boolean.valueOf(this.a.getResources().getBoolean(i));
    }

    @Nullable
    public final Boolean b(int i) {
        return Boolean.valueOf(this.a.getResources().getBoolean(i));
    }
}
