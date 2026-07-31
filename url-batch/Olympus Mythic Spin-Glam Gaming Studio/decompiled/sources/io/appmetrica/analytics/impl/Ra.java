package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes9.dex */
public final class Ra extends Qa {
    public Ra(int i, int i2) {
        this(i, new Sa(i2));
    }

    public final int a(@Nullable String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final int b(@Nullable Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    @VisibleForTesting
    public Ra(int i, @NonNull Sa sa) {
        super(i, sa);
    }
}
