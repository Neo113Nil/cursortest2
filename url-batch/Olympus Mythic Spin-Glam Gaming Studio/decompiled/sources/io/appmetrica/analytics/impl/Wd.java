package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class Wd implements Consumer {
    public final C5234bh a;
    public final J0 b;
    public final C5334fe c;

    public Wd(@NotNull C5234bh c5234bh, @NotNull J0 j0, @NotNull C5334fe c5334fe) {
        this.a = c5234bh;
        this.b = j0;
        this.c = c5334fe;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@NotNull String str) {
        C5234bh c5234bh = this.a;
        J0 j0 = this.b;
        String str2 = j0.a;
        String str3 = j0.b;
        Integer valueOf = Integer.valueOf(j0.d);
        J0 j02 = this.b;
        C5350g4 c5350g4 = new C5350g4(str2, str3, valueOf, j02.e, j02.c);
        C5334fe c5334fe = this.c;
        EnumC5798xb enumC5798xb = c5334fe.b;
        I0 i0 = c5334fe.a;
        String str4 = i0.c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(i0.f.a);
        long a = ((G6) c5334fe.c).a(c5334fe.a);
        Set set = Q9.a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        C5273d4 c5273d4 = new C5273d4("", "", enumC5798xb.a, orCreatePublicLogger);
        c5273d4.b(a);
        if (str != null) {
            c5273d4.f(str);
        }
        c5273d4.m = bundle;
        c5273d4.c = c5334fe.a.f.f;
        c5234bh.a(c5350g4, c5273d4, new G4(new C5628qm(), new F4(), null));
    }
}
