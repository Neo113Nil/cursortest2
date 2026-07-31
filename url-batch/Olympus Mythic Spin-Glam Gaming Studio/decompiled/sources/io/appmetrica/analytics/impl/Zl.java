package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes13.dex */
public final class Zl extends E5 {
    public Zl(C5653rm c5653rm, C5783wm c5783wm, C5628qm c5628qm) {
        super(c5653rm, c5783wm, c5628qm);
    }

    @Override // io.appmetrica.analytics.impl.E5
    public final synchronized void a(@NonNull C5628qm c5628qm) {
        a(new C5223b6(c(), Ka.I.v(), Ka.I.s(), ((C5628qm) b()).mergeFrom(c5628qm)));
        e();
    }
}
