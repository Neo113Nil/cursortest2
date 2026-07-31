package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes11.dex */
public final class Ic extends AbstractC5319f {
    public Ic(Context context, Kg kg) {
        super(context, kg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5319f
    public final void b(@NonNull C5326f6 c5326f6, @NonNull G4 g4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(g4.b.b, Boolean.FALSE)).booleanValue();
        InterfaceC5358gc m = Ka.I.m();
        m.a(booleanValue);
        m.a(g4.b.c);
        Boolean bool = g4.b.n;
        if (bool != null) {
            Ka.I.c().b(bool.booleanValue());
        }
        this.b.a(c5326f6, g4);
    }
}
