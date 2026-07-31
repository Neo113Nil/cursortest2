package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes11.dex */
public final class L4 implements InterfaceC5765w4 {
    public final Context a;
    public final N4 b;
    public final ResultReceiver c;

    public L4(@NonNull Context context, @NonNull N4 n4, @NonNull G4 g4) {
        this.a = context;
        this.b = n4;
        this.c = g4.c;
        n4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5765w4
    public final void a(@NonNull C5326f6 c5326f6, @NonNull G4 g4) {
        this.b.a(g4.b);
        this.b.a(c5326f6, this);
    }

    @NonNull
    public final N4 b() {
        return this.b;
    }

    @NonNull
    public final Context c() {
        return this.a;
    }

    @NonNull
    @VisibleForTesting
    public final ResultReceiver d() {
        return this.c;
    }

    public final void a(@NonNull C5427j4 c5427j4) {
        T6.a(this.c, c5427j4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5765w4
    public final void a() {
        this.b.b(this);
    }
}
