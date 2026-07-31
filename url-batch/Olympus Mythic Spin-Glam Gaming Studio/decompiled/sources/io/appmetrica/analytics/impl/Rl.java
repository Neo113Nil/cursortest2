package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Rl implements X2 {
    public final Context a;

    public Rl(@NotNull Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.X2, io.appmetrica.analytics.impl.Bm
    public final void a(@NotNull C5783wm c5783wm) {
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    @NotNull
    public final Context a() {
        return this.a;
    }
}
