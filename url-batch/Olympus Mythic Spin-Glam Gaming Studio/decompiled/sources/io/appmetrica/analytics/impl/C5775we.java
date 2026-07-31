package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.we, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5775we implements Ko {
    public final String a;

    public C5775we(@NonNull String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable Object obj) {
        if (obj != null) {
            return new Io(this, true, "");
        }
        return new Io(this, false, this.a + " is null.");
    }

    @NonNull
    public final String a() {
        return this.a;
    }
}
