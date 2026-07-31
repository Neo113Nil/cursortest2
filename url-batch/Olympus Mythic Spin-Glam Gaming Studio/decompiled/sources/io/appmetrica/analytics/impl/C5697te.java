package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5697te implements Ko {
    public final String a;

    public C5697te(@NonNull String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable Collection<Object> collection) {
        if (!Do.a((Collection) collection)) {
            return new Io(this, true, "");
        }
        return new Io(this, false, this.a + " is null or empty.");
    }
}
