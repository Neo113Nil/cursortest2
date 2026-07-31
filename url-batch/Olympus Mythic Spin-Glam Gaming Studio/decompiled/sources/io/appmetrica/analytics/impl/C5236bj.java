package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5236bj implements Ko {
    public final Jo a = new Jo();

    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable Revenue revenue) {
        Io io2;
        Jo jo = this.a;
        C5543ng c5543ng = new C5543ng();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            io2 = new Io(c5543ng, true, "");
        } else {
            io2 = new Io(c5543ng, false, "Invalid quantity value " + num);
        }
        List<Io> asList = Arrays.asList(io2);
        jo.getClass();
        return jo.a(asList);
    }
}
