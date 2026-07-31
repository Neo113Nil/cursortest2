package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.nc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4206nc implements InterfaceC4179mc {
    public final InterfaceC4179mc a;
    public final AtomicBoolean b;

    public C4206nc(InterfaceC4179mc mediaChangeReceiver) {
        Intrinsics.checkNotNullParameter(mediaChangeReceiver, "mediaChangeReceiver");
        this.a = mediaChangeReceiver;
        this.b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC4179mc
    public final void a() {
        if (this.b.getAndSet(false)) {
            this.a.a();
        }
    }

    @Override // com.inmobi.media.InterfaceC4179mc
    public final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.b();
    }
}
