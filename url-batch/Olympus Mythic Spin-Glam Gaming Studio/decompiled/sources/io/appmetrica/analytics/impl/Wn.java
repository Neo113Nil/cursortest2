package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ValidationException;

/* loaded from: classes13.dex */
public class Wn implements Ko {
    public final Ko a;

    public Wn(@NonNull Ko ko) {
        this.a = ko;
    }

    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable Object obj) {
        Io a = this.a.a(obj);
        if (a.a) {
            return a;
        }
        throw new ValidationException(a.b);
    }

    @NonNull
    @VisibleForTesting
    public final Ko a() {
        return this.a;
    }
}
