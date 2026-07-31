package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.idsync.impl.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5189g implements ActivationBarrierCallback {
    public final /* synthetic */ h a;

    public C5189g(h hVar) {
        this.a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        C5188f c5188f = this.a.g;
        if (c5188f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncRunnable");
            c5188f = null;
        }
        c5188f.run();
    }
}
