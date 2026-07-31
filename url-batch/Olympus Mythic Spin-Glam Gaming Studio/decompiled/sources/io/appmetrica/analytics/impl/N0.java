package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class N0 {
    public final IHandlerExecutor a = C5661s4.l().g().a();
    public final B0 b;
    public final C5490lf c;
    public final C5568of d;

    public N0() {
        B0 b0 = new B0();
        this.b = b0;
        this.c = new C5490lf(b0);
        this.d = new C5568of();
    }

    public final void a(final PluginErrorDetails pluginErrorDetails) {
        C5490lf c5490lf = this.c;
        c5490lf.a.a(null);
        c5490lf.b.a(pluginErrorDetails);
        C5568of c5568of = this.d;
        Intrinsics.checkNotNull(pluginErrorDetails);
        c5568of.getClass();
        this.a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.N0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                N0.a(N0.this, pluginErrorDetails);
            }
        });
    }

    public final void a(final PluginErrorDetails pluginErrorDetails, final String str) {
        C5490lf c5490lf = this.c;
        c5490lf.a.a(null);
        c5490lf.b.a(pluginErrorDetails);
        if (c5490lf.d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).a) {
            C5568of c5568of = this.d;
            Intrinsics.checkNotNull(pluginErrorDetails);
            c5568of.getClass();
            this.a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.N0$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    N0.a(N0.this, pluginErrorDetails, str);
                }
            });
        }
    }

    public final void a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        C5490lf c5490lf = this.c;
        c5490lf.a.a(null);
        c5490lf.c.a(str);
        C5568of c5568of = this.d;
        Intrinsics.checkNotNull(str);
        c5568of.getClass();
        this.a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.N0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                N0.a(N0.this, str, str2, pluginErrorDetails);
            }
        });
    }

    public static final void a(N0 n0, PluginErrorDetails pluginErrorDetails, String str) {
        n0.b.getClass();
        A0 a0 = A0.e;
        Intrinsics.checkNotNull(a0);
        Fc i = a0.f().i();
        Intrinsics.checkNotNull(i);
        i.a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(N0 n0, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        n0.b.getClass();
        A0 a0 = A0.e;
        Intrinsics.checkNotNull(a0);
        Fc i = a0.f().i();
        Intrinsics.checkNotNull(i);
        i.a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(N0 n0, PluginErrorDetails pluginErrorDetails) {
        n0.b.getClass();
        A0 a0 = A0.e;
        Intrinsics.checkNotNull(a0);
        Fc i = a0.f().i();
        Intrinsics.checkNotNull(i);
        i.a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
