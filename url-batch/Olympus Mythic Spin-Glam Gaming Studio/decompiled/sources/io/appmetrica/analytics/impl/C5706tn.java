package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.tn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5706tn implements Cdo {
    public final Cdo a;
    public final Object b;

    public C5706tn(@NonNull Cdo cdo, @Nullable Object obj) {
        this.a = cdo;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Cdo
    @Nullable
    public final Object a(@Nullable Object obj) {
        return obj != this.a.a(obj) ? this.b : obj;
    }
}
