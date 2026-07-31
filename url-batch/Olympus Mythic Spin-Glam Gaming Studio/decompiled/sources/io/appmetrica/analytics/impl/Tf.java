package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes9.dex */
public final class Tf extends Qa {
    public Tf(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.Qa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(@Nullable C5217b0 c5217b0) {
        if (c5217b0 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(c5217b0.b) + 12;
    }
}
