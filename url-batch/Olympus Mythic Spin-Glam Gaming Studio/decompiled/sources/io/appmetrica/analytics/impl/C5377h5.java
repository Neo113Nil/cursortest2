package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5377h5 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(@NonNull InterfaceC5765w4 interfaceC5765w4) {
        this.a.add(interfaceC5765w4);
    }

    public final void b(@NonNull InterfaceC5765w4 interfaceC5765w4) {
        this.a.remove(interfaceC5765w4);
    }

    public final List<InterfaceC5765w4> a() {
        return this.a;
    }
}
