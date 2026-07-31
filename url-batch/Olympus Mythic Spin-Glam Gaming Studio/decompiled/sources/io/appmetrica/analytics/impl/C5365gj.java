package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5365gj implements N9 {
    @Override // io.appmetrica.analytics.impl.N9
    @Nullable
    public final Integer a(@NonNull C5381h9 c5381h9) {
        EnumC5798xb enumC5798xb = c5381h9.h;
        if (enumC5798xb != null) {
            return (Integer) AbstractC5465kg.c.get(enumC5798xb);
        }
        Map map = AbstractC5465kg.a;
        return null;
    }
}
