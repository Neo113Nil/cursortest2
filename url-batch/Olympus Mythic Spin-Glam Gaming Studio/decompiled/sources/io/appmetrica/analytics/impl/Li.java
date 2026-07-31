package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Li implements InterfaceC5729uk {

    @NotNull
    public static final Ki e = new Ki();
    public static final long f;
    public static final long g;
    public final C5631r0 a;
    public final C5599pk b;
    public final TimeProvider c;
    public final ICommonExecutor d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f = timeUnit.toMillis(1L);
        g = timeUnit.toMillis(4L);
    }

    @VisibleForTesting
    public Li(@NotNull C5631r0 c5631r0, @NotNull C5599pk c5599pk, @NotNull TimeProvider timeProvider) {
        this.a = c5631r0;
        this.b = c5599pk;
        this.c = timeProvider;
        this.d = C5661s4.l().g().c();
    }

    public final void a(@NotNull Ih ih) {
        Kh yg;
        ICommonExecutor iCommonExecutor = this.d;
        if (ih.b) {
            C5599pk c5599pk = this.b;
            yg = new C5663s6(c5599pk.a, c5599pk.b, c5599pk.c, ih, true);
        } else {
            C5599pk c5599pk2 = this.b;
            yg = new Yg(c5599pk2.b, c5599pk2.c, ih);
        }
        iCommonExecutor.submit(yg);
    }

    public final void b(@NotNull Ih ih) {
        long uptimeMillis = this.c.uptimeMillis();
        C5599pk c5599pk = this.b;
        C5663s6 c5663s6 = new C5663s6(c5599pk.a, c5599pk.b, c5599pk.c, ih, false);
        long j = Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) ? f : g;
        if (this.a.a()) {
            try {
                this.d.submit(c5663s6).get(j, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c5663s6.c) {
            return;
        }
        try {
            c5663s6.a();
            Thread.sleep(Math.max(0L, j - (this.c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5729uk
    public final void reportData(int i, @NotNull Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.d;
        C5599pk c5599pk = this.b;
        iCommonExecutor.submit(new C5344fo(c5599pk.b, c5599pk.c, i, bundle));
    }

    public Li(@NotNull C5631r0 c5631r0, @NotNull C5599pk c5599pk) {
        this(c5631r0, c5599pk, new SystemTimeProvider());
    }

    public final void a(@NotNull Wf wf) {
        ICommonExecutor iCommonExecutor = this.d;
        C5599pk c5599pk = this.b;
        iCommonExecutor.submit(new Me(c5599pk.b, c5599pk.c, wf));
    }

    public final void b(@NotNull Wf wf) {
        ICommonExecutor iCommonExecutor = this.d;
        C5599pk c5599pk = this.b;
        iCommonExecutor.submit(new Ri(c5599pk.b, c5599pk.c, wf));
    }
}
