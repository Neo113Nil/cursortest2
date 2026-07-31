package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class R1 implements InterfaceC5729uk {

    @NotNull
    public static final Q1 b = new Q1();
    public static final int c = 1;
    public final InterfaceC5709u0 a;

    public R1(@NotNull InterfaceC5709u0 interfaceC5709u0) {
        this.a = interfaceC5709u0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5729uk
    @WorkerThread
    public final void reportData(int i, @NotNull Bundle bundle) {
        ((O1) this.a).a(bundle);
    }
}
