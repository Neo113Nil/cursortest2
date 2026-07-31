package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5494lj extends AbstractC5208ah {
    public C5494lj(@NonNull C5532n5 c5532n5) {
        super(c5532n5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        String str = c5326f6.h;
        if (StringUtils.isNullOrEmpty(str)) {
            return false;
        }
        this.a.a(str);
        return false;
    }
}
