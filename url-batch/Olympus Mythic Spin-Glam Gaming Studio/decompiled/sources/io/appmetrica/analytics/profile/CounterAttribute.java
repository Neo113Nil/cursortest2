package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5255cc;
import io.appmetrica.analytics.impl.C5352g6;
import io.appmetrica.analytics.impl.InterfaceC5785wo;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Mb;

/* loaded from: classes4.dex */
public final class CounterAttribute {
    private final L6 a;

    CounterAttribute(String str, Mb mb, C5255cc c5255cc) {
        this.a = new L6(str, mb, c5255cc);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withDelta(double d) {
        return new UserProfileUpdate<>(new C5352g6(this.a.c, d));
    }
}
