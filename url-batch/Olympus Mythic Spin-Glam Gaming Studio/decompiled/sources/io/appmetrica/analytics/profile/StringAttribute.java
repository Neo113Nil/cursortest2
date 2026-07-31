package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5576on;
import io.appmetrica.analytics.impl.C5602pn;
import io.appmetrica.analytics.impl.C5652rl;
import io.appmetrica.analytics.impl.Cdo;
import io.appmetrica.analytics.impl.InterfaceC5763w2;
import io.appmetrica.analytics.impl.InterfaceC5785wo;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.Ko;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Oi;

/* loaded from: classes4.dex */
public class StringAttribute {
    private final Cdo a;
    private final L6 b;

    StringAttribute(String str, C5576on c5576on, Ko ko, InterfaceC5763w2 interfaceC5763w2) {
        this.b = new L6(str, ko, interfaceC5763w2);
        this.a = c5576on;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValue(@NonNull String str) {
        L6 l6 = this.b;
        return new UserProfileUpdate<>(new C5602pn(l6.c, str, this.a, l6.a, new J4(l6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValueIfUndefined(@NonNull String str) {
        L6 l6 = this.b;
        return new UserProfileUpdate<>(new C5602pn(l6.c, str, this.a, l6.a, new C5652rl(l6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValueReset() {
        L6 l6 = this.b;
        return new UserProfileUpdate<>(new Oi(0, l6.c, l6.a, l6.b));
    }
}
