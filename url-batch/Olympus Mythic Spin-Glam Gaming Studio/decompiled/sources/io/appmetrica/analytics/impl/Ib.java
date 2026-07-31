package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class Ib implements InterfaceC5730ul {
    @Override // io.appmetrica.analytics.impl.InterfaceC5730ul
    public final boolean a(@NotNull Fb fb) {
        Integer num = fb.f;
        return num == null || num.intValue() != Process.myPid();
    }
}
