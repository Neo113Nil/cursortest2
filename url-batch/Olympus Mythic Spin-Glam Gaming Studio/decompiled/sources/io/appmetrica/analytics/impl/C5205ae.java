package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ae, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5205ae implements InterfaceC5730ul {
    public final int a;

    public C5205ae(int i) {
        this.a = i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5730ul
    public final boolean a(@NotNull String str) {
        return this.a != Process.myPid();
    }
}
