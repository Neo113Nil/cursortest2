package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Ga implements InterfaceC5643rc {
    @Override // io.appmetrica.analytics.impl.InterfaceC5643rc
    @Nullable
    public final C5692t9 a(@Nullable C5846z7 c5846z7) {
        C5692t9 c5692t9 = null;
        if ((c5846z7 != null ? c5846z7.b : null) != null && c5846z7.c != null) {
            c5692t9 = new C5692t9();
            c5692t9.b = c5846z7.b.doubleValue();
            c5692t9.a = c5846z7.c.doubleValue();
            Integer num = c5846z7.d;
            if (num != null) {
                c5692t9.g = num.intValue();
            }
            Integer num2 = c5846z7.e;
            if (num2 != null) {
                c5692t9.e = num2.intValue();
            }
            Integer num3 = c5846z7.f;
            if (num3 != null) {
                c5692t9.d = num3.intValue();
            }
            Integer num4 = c5846z7.g;
            if (num4 != null) {
                c5692t9.f = num4.intValue();
            }
            Long l = c5846z7.h;
            if (l != null) {
                c5692t9.c = TimeUnit.MILLISECONDS.toSeconds(l.longValue());
            }
            String str = c5846z7.i;
            if (str != null) {
                if (Intrinsics.areEqual(str, "gps")) {
                    c5692t9.h = 1;
                } else if (Intrinsics.areEqual(str, "network")) {
                    c5692t9.h = 2;
                }
            }
            String str2 = c5846z7.j;
            if (str2 != null) {
                c5692t9.i = str2;
            }
        }
        return c5692t9;
    }
}
