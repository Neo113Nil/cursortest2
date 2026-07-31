package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes9.dex */
public final class Rg implements InterfaceC5239bm {
    public final Rm a;

    public Rg(@NonNull Rm rm) {
        this.a = rm;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5239bm
    public final void a() {
        NetworkTask c = this.a.c();
        if (c != null) {
            Ka.I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c);
        }
    }
}
