package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5648rh extends AbstractC5208ah {
    public C5648rh(C5532n5 c5532n5) {
        super(c5532n5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        C5532n5 c5532n5 = this.a;
        synchronized (c5532n5) {
            ((A5) c5532n5.p).d();
        }
        return false;
    }
}
