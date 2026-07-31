package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5699tg {
    public final boolean a;
    public final Ji b;
    public final C5594pf c;
    public final C5277d8 d;
    public final Ag e;
    public final Handler f;

    public C5699tg(Ji ji, C5594pf c5594pf, @NonNull Handler handler) {
        this(ji, c5594pf, handler, c5594pf.s());
    }

    public final void a() {
        if (this.a) {
            return;
        }
        Ji ji = this.b;
        Fg fg = new Fg(this.f, this);
        ji.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", fg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = Q9.a;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        C5273d4 c5273d4 = new C5273d4("", "", 4098, 0, anonymousInstance);
        c5273d4.m = bundle;
        V4 v4 = ji.a;
        ji.a(Ji.a(c5273d4, v4), v4, 1, (Map) null);
    }

    public C5699tg(Ji ji, C5594pf c5594pf, Handler handler, boolean z) {
        this(ji, c5594pf, handler, z, new C5277d8(z), new Ag());
    }

    public C5699tg(Ji ji, C5594pf c5594pf, Handler handler, boolean z, C5277d8 c5277d8, Ag ag) {
        this.b = ji;
        this.c = c5594pf;
        this.a = z;
        this.d = c5277d8;
        this.e = ag;
        this.f = handler;
    }

    public final void a(@Nullable C5751vg c5751vg) {
        String str = c5751vg == null ? null : c5751vg.a;
        if (this.a) {
            return;
        }
        synchronized (this) {
            C5277d8 c5277d8 = this.d;
            this.e.getClass();
            c5277d8.d = Ag.a(str);
            c5277d8.a();
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            C5277d8 c5277d8 = this.d;
            c5277d8.c = deferredDeeplinkParametersListener;
            if (c5277d8.a) {
                c5277d8.a(1);
            } else {
                c5277d8.a();
            }
            this.c.u();
        } catch (Throwable th) {
            this.c.u();
            throw th;
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            C5277d8 c5277d8 = this.d;
            c5277d8.b = deferredDeeplinkListener;
            if (c5277d8.a) {
                c5277d8.a(1);
            } else {
                c5277d8.a();
            }
            this.c.u();
        } catch (Throwable th) {
            this.c.u();
            throw th;
        }
    }
}
