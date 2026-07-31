package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.ro, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5655ro extends AbstractC5208ah {
    public C5655ro(C5532n5 c5532n5) {
        super(c5532n5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        String j = this.a.c.j();
        String str = c5326f6.h;
        this.a.a(str);
        if (StringUtils.equalsNullSafety(j, str)) {
            return false;
        }
        this.a.a(C5273d4.o());
        return false;
    }
}
