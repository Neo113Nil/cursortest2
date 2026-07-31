package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5255cc;
import io.appmetrica.analytics.impl.C5550nn;
import io.appmetrica.analytics.impl.C5576on;
import io.appmetrica.analytics.impl.C5678sl;
import io.appmetrica.analytics.impl.C5691t8;
import io.appmetrica.analytics.impl.D4;
import io.appmetrica.analytics.impl.InterfaceC5785wo;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class FirstPartyDataPhoneSha256Attribute {
    private final L6 a = new L6("appmetrica_1pd_phone_sha256", new C5691t8(), new C5255cc(new D4(100)));
    private final C5678sl b;

    FirstPartyDataPhoneSha256Attribute(C5678sl c5678sl) {
        this.b = c5678sl;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withPhoneValues(@NonNull String... strArr) {
        return withPhoneValues(Arrays.asList(strArr));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withPhoneValues(@NonNull Iterable<String> iterable) {
        String str = this.a.c;
        ArrayList a = this.b.a(iterable);
        C5576on c5576on = new C5576on(200, "First party data phones attribute", PublicLogger.getAnonymousInstance());
        L6 l6 = this.a;
        return new UserProfileUpdate<>(new C5550nn(str, a, 10, c5576on, l6.a, new J4(l6.b)));
    }
}
