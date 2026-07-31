package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes8.dex */
public abstract class W4 extends E5 {
    public W4(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, C5223b6> componentLoader, @NonNull C5783wm c5783wm, @NonNull BaseRequestConfig.BaseRequestArguments<F4, Object> baseRequestArguments) {
        super(componentLoader, c5783wm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.E5
    public final void a(@NonNull Object obj) {
        F4 f4 = (F4) obj;
        synchronized (this) {
            super.a((Object) f4);
        }
    }

    public final synchronized void a(@NonNull F4 f4) {
        super.a((Object) f4);
    }
}
