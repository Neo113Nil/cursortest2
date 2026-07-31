package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5440jh implements Fn {
    public final /* synthetic */ D9 a;

    public C5440jh(D9 d9) {
        this.a = d9;
    }

    @Override // io.appmetrica.analytics.impl.Fn
    public final void a(@NotNull List<Cl> list) {
        if (Do.a((Collection) list)) {
            return;
        }
        D9 d9 = this.a;
        int size = list.size();
        B9[] b9Arr = new B9[size];
        for (int i = 0; i < size; i++) {
            Cl cl = list.get(i);
            Map map = AbstractC5465kg.a;
            B9 b9 = new B9();
            Integer num = cl.a;
            if (num != null) {
                b9.a = num.intValue();
            }
            Integer num2 = cl.b;
            if (num2 != null) {
                b9.b = num2.intValue();
            }
            if (!StringUtils.isNullOrEmpty(cl.d)) {
                b9.c = cl.d;
            }
            b9.d = cl.c;
            b9Arr[i] = b9;
        }
        d9.d = b9Arr;
    }
}
