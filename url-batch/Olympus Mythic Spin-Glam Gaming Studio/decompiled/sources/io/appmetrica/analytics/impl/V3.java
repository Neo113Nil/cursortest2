package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class V3 extends SimpleThreadSafeToggle {
    public final C5698tf a;

    public V3(@NotNull C5698tf c5698tf) {
        super(c5698tf.e(), "[ClientApiTrackingStatusToggle]");
        this.a = c5698tf;
    }

    public final void a(boolean z) {
        updateState(z);
        this.a.f(z);
    }
}
