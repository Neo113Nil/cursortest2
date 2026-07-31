package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes6.dex */
public abstract class E5 implements InterfaceC5702tj {
    public BaseRequestConfig a;
    public final BaseRequestConfig.RequestConfigLoader b;
    public C5223b6 c;

    public E5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, C5223b6> requestConfigLoader, @NonNull C5783wm c5783wm, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.b = requestConfigLoader;
        Ka.k().v().a(this);
        a(new C5223b6(c5783wm, Ka.k().v(), Ka.k().s(), argumentsMerger));
    }

    public final synchronized void a(@NonNull C5223b6 c5223b6) {
        this.c = c5223b6;
    }

    @NonNull
    @VisibleForTesting
    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.c.componentArguments;
    }

    @NonNull
    public final synchronized C5783wm c() {
        return this.c.a;
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final synchronized void e() {
        this.a = null;
    }

    public synchronized void a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.c.componentArguments).compareWithOtherArguments(obj)) {
            a(new C5223b6(c(), Ka.I.v(), Ka.I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(@NonNull C5783wm c5783wm) {
        a(new C5223b6(c5783wm, Ka.I.v(), Ka.I.s(), b()));
        e();
    }

    @NonNull
    public final synchronized BaseRequestConfig a() {
        try {
            if (this.a == null) {
                this.a = this.b.load(this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
