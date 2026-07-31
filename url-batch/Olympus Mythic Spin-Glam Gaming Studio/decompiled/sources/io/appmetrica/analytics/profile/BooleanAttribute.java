package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5452k3;
import io.appmetrica.analytics.impl.C5652rl;
import io.appmetrica.analytics.impl.InterfaceC5763w2;
import io.appmetrica.analytics.impl.InterfaceC5785wo;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.Ko;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Oi;

/* loaded from: classes5.dex */
public class BooleanAttribute {
    private final L6 a;

    BooleanAttribute(String str, Ko ko, InterfaceC5763w2 interfaceC5763w2) {
        this.a = new L6(str, ko, interfaceC5763w2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValue(boolean z) {
        L6 l6 = this.a;
        return new UserProfileUpdate<>(new C5452k3(l6.c, z, l6.a, new J4(l6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValueIfUndefined(boolean z) {
        L6 l6 = this.a;
        return new UserProfileUpdate<>(new C5452k3(l6.c, z, l6.a, new C5652rl(l6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValueReset() {
        L6 l6 = this.a;
        return new UserProfileUpdate<>(new Oi(3, l6.c, l6.a, l6.b));
    }
}
