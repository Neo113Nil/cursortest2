package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* loaded from: classes11.dex */
public abstract class K4 extends Ud {
    public final Object f;

    public K4(int i, String str, Object obj, Ko ko, W2 w2) {
        super(i, str, ko, w2);
        this.f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ud, io.appmetrica.analytics.impl.InterfaceC5785wo
    public final void a(@NonNull C5759vo c5759vo) {
        if (f()) {
            W2 w2 = this.d;
            int i = this.b;
            C5811xo a = w2.a(c5759vo, (C5811xo) ((HashMap) c5759vo.a.get(i)).get(this.a), this);
            if (a != null) {
                a(a);
            }
        }
    }

    public abstract void a(@NonNull C5811xo c5811xo);

    @NonNull
    public final Object g() {
        return this.f;
    }
}
