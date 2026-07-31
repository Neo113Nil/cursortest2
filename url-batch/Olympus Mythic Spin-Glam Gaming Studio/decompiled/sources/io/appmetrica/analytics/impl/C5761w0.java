package io.appmetrica.analytics.impl;

import android.app.Service;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5761w0 implements B1 {
    public final Service a;

    public C5761w0(@NotNull Service service) {
        this.a = service;
    }

    public final void a(int i) {
        this.a.stopSelf(i);
    }
}
