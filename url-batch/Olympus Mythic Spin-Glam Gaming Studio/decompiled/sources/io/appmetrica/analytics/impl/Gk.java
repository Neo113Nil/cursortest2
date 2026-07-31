package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Gk implements InterfaceC5282dd {
    @Override // io.appmetrica.analytics.impl.InterfaceC5282dd
    public final void a(@NotNull Context context) {
        AbstractC5420in abstractC5420in = (AbstractC5420in) C5369gn.a(Am.class);
        ProtobufStateStorage<Object> a = abstractC5420in.a(context, abstractC5420in.b(context));
        Am am = (Am) a.read();
        C5861zm a2 = am.a(am.m);
        a2.o = 0L;
        a.save(new Am(a2));
    }
}
