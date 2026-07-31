package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5573ok {
    public volatile long a;
    public C5698tf b;
    public TimeProvider c;

    public static C5573ok c() {
        return AbstractC5547nk.a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.a;
    }

    public final synchronized void b() {
        this.b.d(false);
    }

    public final synchronized long d() {
        return this.a;
    }

    public final synchronized void e() {
        a(Ka.I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.b.b(true);
    }

    public final synchronized void a(long j, @Nullable Long l) {
        try {
            this.a = (j - this.c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.b.b(true)) {
                if (l != null) {
                    long abs = Math.abs(j - this.c.currentTimeMillis());
                    C5698tf c5698tf = this.b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                        z = false;
                    }
                    c5698tf.d(z);
                } else {
                    this.b.d(false);
                }
            }
            this.b.b(this.a);
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public final void a(C5698tf c5698tf, TimeProvider timeProvider) {
        this.b = c5698tf;
        this.a = c5698tf.a(0);
        this.c = timeProvider;
    }
}
