package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5723ue implements Ko {
    public final String a;

    public C5723ue(@NonNull String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable String str) {
        if (!StringUtils.isNullOrEmpty(str)) {
            return new Io(this, true, "");
        }
        return new Io(this, false, this.a + " is empty.");
    }
}
