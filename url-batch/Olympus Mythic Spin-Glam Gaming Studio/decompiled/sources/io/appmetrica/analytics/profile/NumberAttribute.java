package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Be;
import io.appmetrica.analytics.impl.C5255cc;
import io.appmetrica.analytics.impl.C5652rl;
import io.appmetrica.analytics.impl.D4;
import io.appmetrica.analytics.impl.InterfaceC5785wo;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Mb;
import io.appmetrica.analytics.impl.Oi;

/* loaded from: classes11.dex */
public final class NumberAttribute {
    private final L6 a;

    NumberAttribute(String str, Mb mb, C5255cc c5255cc) {
        this.a = new L6(str, mb, c5255cc);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValue(double d) {
        return new UserProfileUpdate<>(new Be(this.a.c, d, new Mb(), new J4(new C5255cc(new D4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new Be(this.a.c, d, new Mb(), new C5652rl(new C5255cc(new D4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValueReset() {
        return new UserProfileUpdate<>(new Oi(1, this.a.c, new Mb(), new C5255cc(new D4(100))));
    }
}
