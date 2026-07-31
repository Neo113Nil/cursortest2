package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes9.dex */
public abstract class Ud implements InterfaceC5785wo, InterfaceC5737v2 {
    public final String a;
    public final int b;
    public final Ko c;
    public final W2 d;
    public PublicLogger e = PublicLogger.getAnonymousInstance();

    public Ud(int i, String str, Ko ko, W2 w2) {
        this.b = i;
        this.a = str;
        this.c = ko;
        this.d = w2;
    }

    @NonNull
    public final C5811xo a() {
        C5811xo c5811xo = new C5811xo();
        c5811xo.b = this.b;
        c5811xo.a = this.a.getBytes();
        c5811xo.d = new C5863zo();
        c5811xo.c = new C5837yo();
        return c5811xo;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5785wo
    public abstract /* synthetic */ void a(@NonNull C5759vo c5759vo);

    @NonNull
    public final W2 b() {
        return this.d;
    }

    @NonNull
    public final String c() {
        return this.a;
    }

    @NonNull
    @VisibleForTesting
    public final Ko d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        Io a = this.c.a(this.a);
        if (a.a) {
            return true;
        }
        this.e.warning("Attribute " + this.a + " of type " + ((String) AbstractC5370go.a.get(this.b)) + " is skipped because " + a.b, new Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5785wo
    public final void a(@NonNull PublicLogger publicLogger) {
        this.e = publicLogger;
    }
}
